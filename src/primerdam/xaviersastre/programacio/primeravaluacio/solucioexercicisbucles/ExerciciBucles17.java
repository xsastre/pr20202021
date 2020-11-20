package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

import java.util.Scanner;

/**
 * Description: Fes un programa que afegeixi els 100 següents nombres a un nombre sencer
 *              positiu introduït per teclat. Si el nombre no és correcte, el tornarà a
 *              demanar fins que el nombre sigui correcte.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles17 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nombreIntroduit = 0;

        do {
            System.out.print("Introduiu un nombre enter positiu: ");
            nombreIntroduit = Integer.parseInt(sc.nextLine());

            if(nombreIntroduit < 0) {
                System.out.println("El nombre introduit no és correcte, heu d'introducir un nombre positiu.");
            }
        } while (nombreIntroduit < 0);

        int suma = 0;

        for(int i = nombreIntroduit; i < nombreIntroduit + 100; i++) {
            suma += i;
        }

        System.out.println("La suma dels 100 nombres següents a " + nombreIntroduit + " és " + suma);
    }
}
