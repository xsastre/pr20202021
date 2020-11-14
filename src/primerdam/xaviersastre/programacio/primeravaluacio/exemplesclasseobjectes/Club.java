package primerdam.xaviersastre.programacio.primeravaluacio.exemplesclasseobjectes;
import org.joda.time.DateTime;

/*
 *       Filename:  Club
 *
 *    Description:  Modelitza un club de futbol; ENG: Modelizes a football's club.
 *
 *        Created:  14 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */

/**
 *
 */
public class Club {

    // Fields

    /** Club's CIF. */
    private String cif = "123456";
    /** Club's name. */
    private String nom = "Betis";
    /** Maximum number of players that a club can have. */
    private static final int MAX_JUGADORS = 20;
    /** Number of club's signed up players. */
    private int nJugadors;
    /** Bonus in euros to share among players, in equal parts. */
    private double bonusJugadors = 100000;
    /** Bonus in euros for goalkeepers. */
    private double bonusPorter = 6000;
    /** Club's signed up players. */
    private Jugador[] equip = new Jugador[MAX_JUGADORS];

    // Constructors

    /**
     * Constructor by default.
     */
    public Club() {

    }

    /**
     * Constructor.
     *
     * @param cif club's CIF
     */
    public Club(String cif) {
        this.cif = cif;
    }

    /**
     * Constructor.
     *
     * @param cif club's cif
     * @param nom club's name
     * @param bonusJugadors players' bonus
     * @param bonusPorter goal keeper's bonus
     */
    public Club(String cif, String nom, double bonusJugadors, double bonusPorter) {
        this.cif = cif;
        this.nom = nom;
        this.bonusJugadors = bonusJugadors;
        this.bonusPorter = bonusPorter;
    }

    // Methods

    /**
     * Signs a player up. It does'nt control if this player has been signed up before.
     *
     * @param jugador the player to be signed up
     * @return true if the player has been signed up, false otherwise
     */
    public boolean contractarJugador(Jugador jugador) {
        // Suppose the player is not signed up
        boolean contractat = false;
        // If the team is not full, the player can be signed up
        if (this.nJugadors < Club.MAX_JUGADORS) {
            // Traverse the team array to find an empty cell
            // (while not signed up)
            for (int i = 0; i < Club.MAX_JUGADORS && !contractat; i++) {
                if (this.equip[i] == null) {
                    // An empty cell to set the new player is found!!!
                    this.equip[i] = jugador; // Put the player in the found cell
                    this.nJugadors++; // Increase the signed up player's counter
                    jugador.setClub(this); // Tell the player that he's part of this club
                    contractat = true; // The player is signed up, exit the loop
                }
            }
        }
        return contractat;
    }

    /**
     * Dismiss a player.
     *
     * @param p player passport's number
     * @return true if the player is dismissed, false otherwise
     */
    public boolean ferForaJugador(int p) {
        // Suppose the player is not dismissed yet
        boolean tret = false;
        // Traverse team array
        for (int i = 0; i < Club.MAX_JUGADORS; i++) {
            // If we find the player
            if (this.equip[i] != null && this.equip[i].getPassaport() == p) {
                this.equip[i].setClub(null); // Tell the player has not club any longer
                this.equip[i] = null; // Remove the player from the team
                this.nJugadors--; // Decrease the club's number of players
                tret = true; // The player has been dismissed
            }
        }
        return tret;
    }

    /**
     * Calculates a player's annual salary (fixed salary plus bonus)
     *
     * @param p player passport's number
     * @return annual salary in euros
     */
    public double souAnual(int p) {
        double sou = 0; // Player's salary
        // Traverse the team to find the player
        for (Jugador player : this.equip) {
            // If the player is found, calculates his salary
            if (player != null && player.getPassaport() == p) {
                sou = player.getSouFixe() + this.bonusJugadors / this.nJugadors;
                if (player.esPorter())
                    sou += this.bonusPorter;
            }
        }
        return sou;
    }

    /**
     * Calculates how much money the club has to pay to "Hisenda" for its player's salaries. The tax is 21% over the
     * annual salaries.
     *
     * @return the amount in euros
     */
    public double pagaImpostos() {
        double s = 0; // Salaries' sum
        for (Jugador player : this.equip) {
            if (player != null) {
                int passaport = player.getPassaport();
                s += this.souAnual(passaport);
            }
        }
        double impost = s * 21.0 / 100;
        return impost;
    }

    /**
     * Determines the player's name whose contract will be expired the first.
     *
     * @return the player's name
     */
    public String seguentsContractesaFinalitzar() {
        String nomJugador = null;
        DateTime now = new DateTime();
        // Future "infinite" datetime
        DateTime dataMesPropera = JodaDT.parseDDMMYYYY("1/1/2500");
        // Traverse the team
        for (Jugador j : this.equip) {
            // If there is a player in the cell and
            // if his contract last date is after now and before the earliest datetime
            if (j != null && j.darreraDataContracte().isAfter(now) && j.darreraDataContracte().isBefore(dataMesPropera)) {
                // Store the player's name
                nomJugador = j.getNom();
                // Store the earliest datetime
                dataMesPropera = j.darreraDataContracte();
            }
        }
        return nomJugador;
    }

    /**
     * Generates a report with passport's number, name, age, contract's initial date, contract's last date and salary of
     * all the players. Indicates the goalkeepers.
     */
    public void informeJugador() {
        System.out.printf("\n%s\n\n", "Report dels jugadors del club de futbol " + this.nom);
        System.out.printf("%-9s %-15s %-5s %-12s %-12s %-6s\n",
                "Passaport",
                "Nom",
                "Edat",
                "DataCont",
                "DataFiCont",
                "Fitxa (€)");
        System.out.print("====================================================================\n");
        for (Jugador player : this.equip) {
            if (player != null) {
                String name = player.esPorter() ? player.getNom() + "*" : player.getNom();
                System.out.printf("%-9d %-15s %-5d %-12s %-12s %-6.0f\n",
                        player.getPassaport(),
                        name,
                        player.edat(),
                        player.getDiaContracte(),
                        JodaDT.formatDDMMYYYY(player.darreraDataContracte()),
                        player.getSouFixe());
            }
        }
        System.out.print("====================================================================\n");
        System.out.printf("Nombre de jugadors: %d\n", this.nJugadors);
        System.out.print("Els noms dels jugadors marcats amb * indica que són porters.\n");
    }

    /**
     * Generates a report with passaport's number and name of players with an annual salary greater than the average.
     */
    public void informeJugadorSobreMitjana() {
        double s = 0; // Salaries' sum
        double sa = 0; // Salaries' average
        // Array with the players whose salary is greater than the average
        Jugador[] jugadorsSM = new Jugador[Club.MAX_JUGADORS];
        // Calculate the average
        for (Jugador jugador : this.equip) {
            if (jugador != null) {
                s += this.souAnual(jugador.getPassaport());
            }
        }
        sa = s / this.nJugadors;
        // Fill the array whose salary is greater than the average
        for (int i = 0; i < Club.MAX_JUGADORS; i++) {
            if (this.equip[i] != null && this.souAnual(this.equip[i].getPassaport()) > sa) {
                jugadorsSM[i] = this.equip[i];
            }
        }
        // Write the report
        System.out.printf("\n%s\n\n", "Report dels jugadors del club de futbol " + this.nom
                + " amb nòmines superiors a la mitjana.");
        System.out.printf("%-9s %-15s\n", "Passaport", "Nom");
        System.out.print("==========================\n");
        for (Jugador player : jugadorsSM) {
            if (player != null) {
                System.out.printf("%-9d %-15s\n", player.getPassaport(), player.getNom());
            }
        }
        System.out.print("==========================\n");
    }

    // Getters & setters

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif.trim();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom.trim();
    }

    public double getBonusJugadors() {
        return bonusJugadors;
    }

    public void setBonusJugadors(double bonusJugadors) {
        this.bonusJugadors = bonusJugadors;
    }

    public double getBonusPorter() {
        return bonusPorter;
    }

    public void setBonusPorter(double bonusPorter) {
        this.bonusPorter = bonusPorter;
    }

    public Jugador[] getEquip() {
        return equip;
    }

    /**
     * Generates a team.
     */
    public void generaEquip() {
        equip = new Jugador[MAX_JUGADORS]; // Initialize a team without players
        // Create an sign up Jugadors
        Jugador jugador = new Jugador(123456, "Joan Romeu", "12/01/2000", "01/03/2018", 4, 100000, false);
        this.contractarJugador(jugador);
        jugador = new Jugador(128951, "Ricard Prat", "14/02/20011", "16/11/2019", 4, 130000, false);
        this.contractarJugador(jugador);
        jugador = new Jugador(666666, "Pol Santos", "02/06/1997", "12/11/2019", 3, 135000, true);
        this.contractarJugador(jugador);
        jugador = new Jugador(336645, "Raül Planas", "17/07/1998", "22/09/2018", 4, 135000, false);
        this.contractarJugador(jugador);
        jugador = new Jugador(336890, "Carles Homs", "23/03/1997", "02/05/2019", 3, 143000, false);
        this.contractarJugador(jugador);
        jugador = new Jugador(301396, "Biel Sans", "13/07/1996", "02/07/2017", 3, 155000, false);
        this.contractarJugador(jugador);
        jugador = new Jugador(301507, "Lluís Roca", "11/04/1997", "27/06/2018", 4, 117000, false);
        this.contractarJugador(jugador);
        jugador = new Jugador(302276, "Joan Pi", "01/02/1998", "13/08/2018", 4, 120000, false);
        this.contractarJugador(jugador);
        jugador = new Jugador(132276, "Emili Casas", "21/03/1998", "17/06/2018", 5, 138000, true);
        this.contractarJugador(jugador);
        jugador = new Jugador(130970, "Pere Morell", "29/10/1997", "03/03/2017", 4, 127000, false);
        this.contractarJugador(jugador);
        jugador = new Jugador(220974, "Pau Desfar", "19/07/1999", "13/07/2018", 4, 159000, false);
        this.contractarJugador(jugador);
        jugador = new Jugador(278974, "Quim Valls", "10/07/1995", "11/07/2017", 5, 162000, false);
        this.contractarJugador(jugador);
    }
}
