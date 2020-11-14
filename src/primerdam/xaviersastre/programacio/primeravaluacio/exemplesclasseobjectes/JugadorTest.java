package primerdam.xaviersastre.programacio.primeravaluacio.exemplesclasseobjectes;
import java.util.Scanner;

/*
 *       Filename:  JugadorTest
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
public class JugadorTest {

    private Club club;
    private Scanner sc = new Scanner(System.in);

    private void menu() {
        this.club = new Club();
        boolean continuar = true;
        while (continuar) {
            System.out.print("\n\nCLUB FUTBOL\n\n");
            System.out.print("Menú principal\n\n");
            System.out.print("  1 Fitxar jugador\n");
            System.out.print("  2 Acomiadar jugador\n");
            System.out.print("  3 Pagar nòmina jugador\n");
            System.out.print("  4 Pagar Hisenda\n");
            System.out.print("  5 Jugador proper fi contracte\n");
            System.out.print("  6 Report jugadors\n");
            System.out.print("  7 Report jugadors nòmina superior a la mitjana\n");
            System.out.print("  8 Generar equip\n");
            System.out.print("  9 Ajuda\n");
            System.out.print("  0 Sortir\n");
            System.out.print("\nOpció (1, 2, 3, 4, 5, 6, 7, 8 , 9, 0) ? ");
            int op = this.sc.nextInt();
            switch (op) {
                case 1:
                    this.contractarJugador();
                    break;
                case 2:
                    this.ferForaJugador();
                    break;
                case 3:
                    this.pagarSouJugador();
                    break;
                case 4:
                    this.pagaImpostos();
                    break;
                case 5:
                    this.seguentsContractesaFinalitzar();
                    break;
                case 6:
                    this.informeJugador();
                    break;
                case 7:
                    this.informeJugadorSobreMitjana();
                    break;
                case 8:
                    this.generaEquip();
                    break;
                case 9:
                    this.mostraAjuda();
                    break;
                default:
                    System.out.print("Fi de l'aplicació\n\n");
                    continuar = false;
            }
        }
    }

    private void contractarJugador() {
        System.out.print("\nPassaport de jugador ? ");
        int pass = this.sc.nextInt();
        System.out.print("Nom del jugador ? ");
        String nom = this.sc.next();
        System.out.print("Data naixement del jugador (dd/MM/aaaa) ? ");
        String dn = this.sc.next();
        System.out.print("Data contracte del jugador (dd/MM/aaaa) ? ");
        String dc = this.sc.next();
        System.out.print("Durada contracte de jugador ? ");
        int dur = this.sc.nextInt();
        System.out.print("Fitxa jugador € ? ");
        double fit = this.sc.nextDouble();
        System.out.print("Es porter (true/false) ? ");
        boolean ep = this.sc.nextBoolean();
        Jugador player = new Jugador(pass, nom, dc, dn, dur, fit, ep);
        boolean haFirmat = this.club.contractarJugador(player);
        if (haFirmat) {
            System.out.print("El jugador ha sigut fitxat.\n");
        } else {
            System.out.print("El jugador no ha sigut fitxat.\n");
        }
    }

    private void ferForaJugador() {
        System.out.print("\nPassaport de jugador ? ");
        int pass = this.sc.nextInt();
        boolean hasDismissed = this.club.ferForaJugador(pass);
        if (hasDismissed) {
            System.out.print("El jugador ha sigut acomiadat.\n");
        } else {
            System.out.print("El jugador no ha sigut acomiadat.\n");
        }
    }

    private void pagarSouJugador() {
        System.out.print("\nPassaport de jugador ? ");
        int pass = this.sc.nextInt();
        double nom = club.souAnual(pass);
        System.out.printf("Nomina: %6.0f €\n", nom);
    }

    private void pagaImpostos() {
        double ph = this.club.pagaImpostos();
        System.out.printf("\nImpostos Hisenda: %8.0f €\n", ph);
    }

    private void seguentsContractesaFinalitzar() {
        String name = this.club.seguentsContractesaFinalitzar();
        System.out.printf("\nProper fi contracte: %s\n", name);
    }

    private void informeJugador() {
        this.club.informeJugador();
    }

    private void informeJugadorSobreMitjana() {
        this.club.informeJugadorSobreMitjana();
    }

    private void generaEquip() {
        this.club.generaEquip();
    }

    private void mostraAjuda() {
        System.out.print("\nNo implementada.\n");
    }

    public static void main(String[] args) {
        JugadorTest ui = new JugadorTest();
        ui.menu();
    }
}