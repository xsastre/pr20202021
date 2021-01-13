package primerdam.xaviersastre.programacio.primeravaluacio;

import java.util.Scanner;

public class ObtenintDadesdelteclat03 {

    public static void main(String[] args) {
        // Creem la instància de la classe Scanner especificant System.in que serà un flux d'entrada
        Scanner lecturateclat=new Scanner(System.in);
        String liniallegida;
        // Ara llegirem des del teclat
        System.out.print("Per favor introduir una línia de text:");
        liniallegida=lecturateclat.nextLine();
        System.out.println("Hem llegit: "+liniallegida);
        // Tornam a llegir del teclat, però ara volem llegir un int. Aleshores, primer hem de preparar
        // un variable per a poder guardar el valor obtingut.
        int intllegit;
        int Intllegit;
        System.out.print("Per favor introduir una nombre sencer:");
        intllegit=lecturateclat.nextInt();
        System.out.println("Ara hem llegit: "+intllegit);
        System.out.println("Tot el que hem llegit és: ");
        System.out.println("Linia: "+liniallegida+" --- "+" Integer: "+intllegit);
    }
}
