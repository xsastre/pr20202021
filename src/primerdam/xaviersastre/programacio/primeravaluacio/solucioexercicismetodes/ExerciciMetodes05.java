package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicismetodes;

/**
 * Description: (Càlculs d’hipotenusa) Definiu un mètode hypotenuse que calcula la
 * hipotenusa d’un triangle rectangle quan es donen les longituds dels altres dos
 * costats. El mètode hauria d’agafar dos arguments de tipus double i retornar la
 * hipotenusa com a double. Incorporeu aquest mètode a una aplicació que llegeixi
 * els valors de side1 i side2 i realitzi el càlcul amb el mètode hypotenuse. Utilitzeu
 * els mètodes matemàtics pow i sqrt per determinar la longitud de la hipotenusa per
 * a cadascun dels triangles de la figura següent [Nota: Class Math també proporciona
 * mètode hypot per realitzar aquest càlcul, de manera que podeu fer un codi addicional
 * per comprovar els resultats mitjançant aquest classe]
 * ENG:
 * (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse
 * of a right triangle when the lengths of the other two sides are given. The method
 * should take two arguments of type double and return the hypotenuse as a double.
 * Incorporate this method into an application that reads values for side1 and side2
 * and performs the calculation with the hypotenuse method. Use Math methods pow and
 * sqrt to determine the length of the hypotenuse for each of the triangles in the
 * following figure [Note: Class Math also provides method hypot to perform this
 * calculation, so you can make an additional code to check your results by using this class]
 * <p>
 * Created:  16 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciMetodes05 {
    public static void main(String[] args){
        // triangle one
        System.out.println("TRIANGLE ONE");
        System.out.printf("side1: %.2f\tside2: %.2f\thypotenuse: %.2f\n",
                3.0, 4.0, hypotenuse(3.0, 4.0));

        // triangle two
        System.out.println("TRIANGLE TWO");
        System.out.printf("side1: %.2f\tside2: %.2f\thypotenuse: %.2f\n",
                5.0, 12.0, hypotenuse(5.0, 12.0));

        // triangle three
        System.out.println("TRIANGLE THREE");
        System.out.printf("side1: %.2f\tside2: %.2f\thypotenuse: %.2f\n",
                8.0, 15.0, hypotenuse(8.0, 15.0));
    }
    // using pythagoras theorem
    // square two shorter sides
    // add the squares
    // square root both sides for h
    public static double hypotenuse(double side1, double side2){
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
