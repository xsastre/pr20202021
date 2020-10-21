package primerdam.xaviersastre.programacio.primeravaluacio;

import java.util.Scanner;

public class ObtenintDadesdelteclat02 {

    public static void main(String[] args) {
        // Creem la instància de la classe Scanner especificant System.in que serà un flux d'entrada
        Scanner lecturateclat=new Scanner(System.in);
        String liniallegida;
        // Ara llegirem des del teclat
        System.out.print("Per favor introduir una línia de text:");
        liniallegida=lecturateclat.nextLine();
        System.out.println("Hem llegit: "+liniallegida);
        // Tornam a llegir del teclat, una altra línia;
        System.out.print("Per favor introduir una línia de text:");
        liniallegida=lecturateclat.nextLine();
        System.out.println("Ara hem llegit: "+liniallegida);
    }
}
