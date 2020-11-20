package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicismetodes;

import java.util.Scanner;

/**
 * Description: (Exponentització) Escriviu un mètode integerPower(base, exponent) que
 * retorni el valor de base elevat a exponent. Per exemple, integerPower(3, 4)
 * calcula (3 * 3 * 3 * 3). Suposem que l'exponent és un enter positiu diferent de zero
 * i que la base és un enter. Utilitzeu una sentència for o while per controlar el càlcul.
 * No utilitzeu cap mètode de la classe Math. Incorporeu aquest mètode a una aplicació
 * que llegeixi els valors enters de base i exponent i realitzi el càlcul amb el
 * mètode integerPower.
 * ENG:
 * (Exponentiation) Write a method integerPower(base, exponent) that returns the value
 * of base exponent. For example, integerPower(3, 4) calculates (3 * 3 * 3 * 3). Assume
 * that exponent is a positive, nonzero integer and that base is an integer. Use a
 * for or while statement to control the calculation. Do not use any Math class methods.
 * Incorporate this method into an application that reads integer values for base and
 * exponent and performs the calculation with the integerPower method.
 * <p>
 * Created:  16 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciMetodes04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long base = 0;
        int exponent = 0;

        while(base != -1){
            System.out.print("Enter base (-1 to exit): ");
            base = sc.nextInt();

            if(base != -1){
                System.out.print("Enter exponent: ");
                exponent = sc.nextInt();

                System.out.println(Math.pow(base, exponent));

                System.out.printf("%d^%d: %d\n",
                        base, exponent, integerPower(base, exponent));
            }
        }
    }
    public static long integerPower(long base, int exponent){
        // base condition
        if(exponent <= 1)
            return base;

        // call self after calculating power with reduced exponent
        return base * integerPower(base, --exponent);
    }
}
