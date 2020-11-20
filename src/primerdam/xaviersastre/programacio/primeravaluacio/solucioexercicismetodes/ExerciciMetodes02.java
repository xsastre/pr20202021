package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicismetodes;

import java.util.Scanner;

/**
 * Description: (Números arrodonits) Math.floor es pot utilitzar per arrodonir els valors
 * al nombre enter més proper, per exemple, y = Math.floor (x + 0,5); arrodonirà el
 * nombre x al nombre enter més proper i assignarà el resultat a y. Escriviu una aplicació
 * que llegeixi valors double i que utilitzi la sentència anterior per arrodonir cadascun
 * dels números al nombre enter més proper. Per a cada número processat, mostreu tant el
 * número original com el número arrodonit.
 * ENG:
 * (Rounding Numbers) Math.floor can be used to round values to the nearest integer,
 * e.g., y = Math.floor( x + 0.5 ); will round the number x to the nearest integer and
 * assign the result to y. Write an application that reads double values and uses the p
 * receding statement to round each of the numbers to the nearest integer. For each number
 * processed, display both the original number and the rounded number.
 * <p>
 * Created:  16 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciMetodes02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x = 0.0f, y = 0.0f;

        while(x != -1){
            System.out.print("Enter number for rounding (-1 to exit): ");
            x = sc.nextDouble();
            y = Math.floor(x + 0.5f);

            System.out.printf("Original: %.2f\nRounded: %d\n", x, (int)y);
        }
    }
}