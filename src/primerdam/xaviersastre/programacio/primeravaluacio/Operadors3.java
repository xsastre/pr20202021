package primerdam.xaviersastre.programacio.primeravaluacio;
/*
 *       Filename:  OrdreOperadors3.java
 *
 *    Description:  Escriu un programa que calculi la velocitat utilitzant
 *                  una constant distància i una constant temps.
 *
 *        Created:  30 d’oct. 2020
 *       Revision:  none
 *
 *        @Author:  xavier - xavier.sastre@cide.es
 *       @Version:  1.0
 *
 * =====================================================================================
 */

import java.util.*;

public class Operadors3 {
    public static void main(String[] args) {
        final float DISTANCE=10;
        final float TIME=2;
        float velocity;
        velocity = DISTANCE / TIME;
        System.out.println("Velocity: " + velocity);
    }
}