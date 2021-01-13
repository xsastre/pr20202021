package primerdam.xaviersastre.programacio.primeravaluacio;


import java.util.Scanner;

public class ObtenintDadesdelteclat01 {

    public static void main(String[] args) {
        // Creem la instància de la classe Scanner especificant System.in que serà un flux d'entrada
        Scanner lecturateclat=new Scanner(System.in);
        int liniallegida1,liniallegida2;
        // Ara llegirem des del teclat
        System.out.print("Per favor introduir un nombre sencer:");
        liniallegida1=lecturateclat.nextInt();
        System.out.println("Hem llegit: "+liniallegida1);
        // Tornam a llegir del teclat, un altre int;
        System.out.print("Per favor introduir un segon nombre sencer:");
        liniallegida2=lecturateclat.nextInt();
        System.out.println("Ara hem llegit: "+liniallegida2);
        int suma=liniallegida1+liniallegida2;
        System.out.println("La suma dels dos valors és: "+ suma);
    }
}
