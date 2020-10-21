package primerdam.xaviersastre.programacio.primeravaluacio;

import java.util.Scanner;

public class ObtenintDadesdelteclat01 {

    public static void main(String[] args) {
        // Creem la instància de la classe Scanner especificant System.in que serà un flux d'entrada
        Scanner lecturateclat=new Scanner(System.in);
        int liniallegida;
        // Ara llegirem des del teclat
        System.out.print("Per favor introduir un nombre sencer:");
        liniallegida=lecturateclat.nextInt();
        System.out.println("Hem llegit: "+liniallegida);
        // Tornam a llegir del teclat, un altre int;
        System.out.print("Per favor introduir un segon nombre sencer:");
        liniallegida=lecturateclat.nextInt();
        System.out.println("Ara hem llegit: "+liniallegida);
    }
}
