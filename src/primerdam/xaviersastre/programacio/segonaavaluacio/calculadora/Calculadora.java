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
public class Calculadora {

    public int suma(int operadorA,int operadorB) {
        return operadorA+operadorB;
    }
    public int resta(int operadorA,int operadorB) {
        return operadorA-operadorB;
    }
    public int multiplicacio(int operadorA,int operadorB) {
        return operadorA*operadorB;
    }
    public int divisioEntera(int operadorA,int operadorB) {
        return operadorA/operadorB;
    }
    public double divisio(int operadorA,int operadorB) {
        return (double)operadorA/(double)operadorB;
    }
}
