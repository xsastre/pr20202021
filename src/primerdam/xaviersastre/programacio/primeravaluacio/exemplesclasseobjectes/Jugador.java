package primerdam.xaviersastre.programacio.primeravaluacio.exemplesclasseobjectes;

/*
 *       Filename:  Jugador
 *
 *    Description:
 *
 *        Created:  14 nov. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 * Modelizes a football's player.
 */
public class Jugador {

    // Fields

    /**
     * The player's passport number.
     */
    private int passport = 123456;
    /**
     * El player's name.
     */
    private String name = "Pau Ramos";
    /**
     * The player's birthday.
     */
    private String birthday = "12/07/1989";
    /**
     * The contract's initial day.
     */
    private String contractDay = "07/11/2008";
    /**
     * The duration in years of the contract.
     */
    private int contractDuration = 4;
    /**
     * The player's fixed salary.
     */
    private double fixedSalary = 176000;
    /**
     * If the player is a goalkeeper.
     */
    private boolean isGoalkeeper = true;
    /**
     * The player's club.
     */
    private Club club;

    // Constructors

    /**
     * Constructor by default
     */
    public Jugador() {

    }

    /**
     * Constructor.
     *
     * @param pass the player's passport number
     */
    public Jugador(int pass) {
        this.passport = pass;
    }

    /**
     * Constructor.
     *
     * @param pass             the player's passport number
     * @param name             the player's name
     * @param birthday         the player's birthday
     * @param contractDay      the contract's initial day
     * @param contractDuration the duration in years of the contract
     * @param fixedSalary      the player's fixed salary, in euros
     * @param isGoalkeeper     true if the player is a goalkeeper, false otherwise
     */
    public Jugador(int pass, String name, String birthday, String contractDay, int contractDuration,
                   double fixedSalary, boolean isGoalkeeper) {
        this.passport = pass;
        this.name = name;
        this.birthday = birthday;
        this.contractDay = contractDay;
        this.contractDuration = contractDuration;
        this.fixedSalary = fixedSalary;
        this.isGoalkeeper = isGoalkeeper;
    }

    // Mètodes

    /**
     * Calculates player's age.
     *
     * @return player's agein years
     */
    public int edat() {
        DateTime now = new DateTime();
        DateTime dn = JodaDT.parseDDMMYYYY(this.birthday);
        Period timeOfLife = new Period(dn, now);
        int years = timeOfLife.getYears();
        return years;
    }

    /**
     * Calculates the last day of the contract
     *
     * @return the last day of the contract
     */
    public DateTime darreraDataContracte() {
        DateTime cd = JodaDT.parseDDMMYYYY(this.contractDay);
        DateTime contractLastDay = cd.plusYears(this.contractDuration);
        return contractLastDay;
    }

    /**
     * Calculates the last day of the contract
     *
     * @return the last day of the contract
     */
    public String contractLastDateDDMMYYYY() {
        String contractLasDay = JodaDT.formatDDMMYYYY(this.darreraDataContracte());
        return contractLasDay;
    }

    // Getters and setters

    public int getPassaport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public String getNom() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday.trim();
    }

    public String getDiaContracte() {
        return contractDay;
    }

    public void setContractDay(String contractDay) {
        this.contractDay = contractDay.trim();
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    public double getSouFixe() {
        return fixedSalary;
    }

    public void setSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public boolean esPorter() {
        return isGoalkeeper;
    }

    public void setGoalkeeper(boolean isGoalkeeper) {
        this.isGoalkeeper = isGoalkeeper;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

}