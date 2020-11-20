package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicismetodes;

import java.util.Scanner;

/**
 * Description: (Nombres arrodonits) Per arrodonir nombres a posicions decimals
 * específiques, utilitzeu una ordre com y = Math.floor (x * 10 + 0,5) / 10;
 * que arrodoneix x fins a la desena posició (és a dir, la primera posició a la
 * dreta del punt decimal), o y = Math.floor (x * 100 + 0,5) / 100; que
 * arrodoneix x fins a la posició de les centèsimes (és a dir, la segona posició
 * a la dreta del punt decimal). Escriviu una aplicació que defineixi quatre mètodes
 * per arrodonir un nombre x de diverses maneres:
 * a) roundToInteger (número)
 * b) roundToTenths (nombre)
 * c) roundToHundredths (nombre)
 * d) roundToThousandths (nombre)
 * Per a cada valor llegit, el programa hauria de mostrar el valor original, el número
 * arrodonit al enter més proper, el número arrodonit al dècim més proper, el número
 * arrodonit a la centena més propera i el número arrodonit a la mil·lèsima més propera.
 * ENG:
 * (Rounding Numbers) To round numbers to specific decimal places, use a statement
 * like y = Math.floor( x * 10 + 0.5 ) / 10; which rounds x to the tenths position
 * (i.e., the first position to the right of the decimal point), or
 * y = Math.floor( x * 100 + 0.5 ) / 100; which rounds x to the hundredths position
 * (i.e., the second position to the right of the decimal point). Write an application
 * that defines four methods for rounding a number x in various ways:
 * a) roundToInteger( number )
 * b) roundToTenths( number )
 * c) roundToHundredths( number )
 * d) roundToThousandths( number )
 * For each value read, your program should display the original value, the number rounded
 * to the nearest integer, the number rounded to the nearest tenth, the number rounded to
 * the nearest hun- dredth and the number rounded to the nearest thousandth.
 * <p>
 * Created:  16 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciMetodes03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double number = 0.0;

        while(number != -1){
            System.out.print("Enter double value to be rounded (-1 to exit): ");
            number = sc.nextDouble();

            if(number != -1){
                System.out.println("Original number " + number);
                System.out.printf("Nearest Int: %f\n", roundToInteger(number));
                System.out.printf("Tenths: %f\n", roundToTenths(number));
                System.out.printf("Hundredths: %f\n", roundToHundredths(number));
                System.out.printf("Thousandths: %f\n", roundToThousandths(number));
            }
        }
    }
    public static double roundToInteger(double number){
        return Math.floor(number + 0.5);
    }
    public static double roundToTenths(double number){
        return Math.floor(number * 10 + 0.5f) / 10;
    }
    public static double roundToHundredths(double number){
        return Math.floor(number * 100 + 0.5f) / 100;
    }
    public static double roundToThousandths(double number){
        return Math.floor(number * 1000 + 0.5f) / 1000;
    }
}
