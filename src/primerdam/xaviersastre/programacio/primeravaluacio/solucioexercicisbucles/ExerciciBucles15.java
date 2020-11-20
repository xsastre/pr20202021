package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

import java.util.Scanner;

/**
 * Description: Escriu un programa que donats dos nombres, un nombre real (base) anomenat
 *              base i un sencer positiu (exponent) anomenat exponent, mostri totes
 *              potències de base des de 0 fins a exponent. Per exemples si base=2 i
 *              exponent=5, aleshores mostrarà 1, 2, 4, 8, 16, 32. No podeu utilitzar
 *              funcions que implementin l’exponenciació.
 * <p>
 * Created:  20 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles15 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduiu un nombre real com a base: ");
        double base = Double.parseDouble(sc.nextLine());

        System.out.print("Introduzca un múmero entero como exponente: ");
        int exponentFinal = Integer.parseInt(sc.nextLine());

        double potencia;
        int exponent;

        for (int i = 0; i <= exponentFinal; i++) {

            potencia = 1;
            exponent = i;

            for (int j = 0; j < exponent; j++) {
                potencia *= base;
            }

            System.out.println(base + "^" + i + " = " + potencia);
        }

    }
}
