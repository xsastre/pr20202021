package primerdam.xaviersastre.programacio.segonaavaluacio.calculadora;

/**
 * Description:
 * <p>
 * Created:  05 des. 2020
 *
 * @author xavier - xavier.sastre@cide.es
 * @version 1.0
 * <p>
 * =====================================================================================
 */
public class CalculadoraCientifica extends Calculadora implements CalculadoraCientificaInterface {

    @Override
    public double potencia(int base, int exponent) {
        int resultat=1;
        for (int i=1;i<=exponent;i++) {
            resultat*=base;
        }
        return resultat;
    }
}
