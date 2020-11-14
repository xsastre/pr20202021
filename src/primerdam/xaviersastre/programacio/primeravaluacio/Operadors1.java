package primerdam.xaviersastre.programacio.primeravaluacio;
/*
Operadors1 : (1) Crear una classe que contingui un float per mostrar aliasing
*/

class FloatData {
    private float fn;
    public void setFn(float sfn) {
        fn = sfn;
    }
    public float getFn() {
        return fn;
    }
}

public class Operadors1 {
    public static void main(String[] args) {
        FloatData fd1 = new FloatData();
        FloatData fdAlias = new FloatData();
        fd1.setFn(1.01f);
        fdAlias.setFn(5.005f);
        System.out.println(fd1.getFn() +" "+ fdAlias.getFn());
        fdAlias = fd1;
        fdAlias.setFn(19.0f);
        System.out.println(fd1.getFn() +" "+ fdAlias.getFn());
        fd1.setFn(100.0099f);
        System.out.println(fd1.getFn() +" "+ fdAlias.getFn());
    }
}