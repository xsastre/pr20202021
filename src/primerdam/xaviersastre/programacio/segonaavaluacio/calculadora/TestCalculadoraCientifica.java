package primerdam.xaviersastre.programacio.segonaavaluacio.calculadora;

/**
 * Description:
 * <p>
 * Created:  09 des. 2020
 *
 * @author xavier - xavier.sastre@cide.es
 * @version 1.0
 * <p>
 * =====================================================================================
 */
public class TestCalculadoraCientifica {

    public static void main(String[] args) {
        CalculadoraCientifica calc=new CalculadoraCientifica();
        System.out.println("Suma de 3 i 4:"+calc.suma(3,4));
        System.out.println("Resta de 3 i 4:"+calc.resta(3,4));
        System.out.println("Divisio de 3 i 4:"+calc.divisio(3,4));
        System.out.println("3 elevat a 4:"+calc.potencia(3,4));
    }
}
