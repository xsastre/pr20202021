/*
 * BicycleTUI.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */



/**
 * Creates two instances of Bicycle to test Bicycle class and set one of them to a person.
 */
public class BicycleTUI {

    /**
     * Main method.
     * 
     * @param args Not used
     */
    public static void main(String[] args) {
        // First example
        Bicycle btt = new Bicycle("BTT High Speed", 2, 1, 3, 7, 0);
        btt.accelerate();
        btt.accelerate();
        btt.changeFrontSprocket(1);
        btt.changeRearSprocket(1);
        btt.accelerate();
        btt.changeRearSprocket(1);
        btt.brake();
        btt.changeFrontSprocket(-1);
        btt.changeRearSprocket(-1);
        btt.changeRearSprocket(1);
        System.out.printf("La %s va a %fkm/h amb el plat %d i el pinyó %d.\n",
                          btt.getModel(),
                          btt.getV(),
                          btt.getFrontSprocket(),
                          btt.getRearSprocket());

        // Second example
        Bicycle cityBike = new Bicycle("Comfort Riding", 1, 1, 1, 3, 0);
        cityBike.accelerate();
        cityBike.changeFrontSprocket(1);
        cityBike.changeRearSprocket(1);
        cityBike.changeRearSprocket(-1);
        cityBike.changeRearSprocket(1);
        System.out.printf("La %s va a %fkm/h amb el plat %d i el pinyó %d.\n\n",
                          cityBike.getModel(),
                          cityBike.getV(),
                          cityBike.getFrontSprocket(),
                          cityBike.getRearSprocket());

        // Third example
        Person girl = new Person("", 0, 0, 'W', false);
        girl.setBike(btt);
        System.out.printf("La persona %s que medeix %f té una %s!!!\n", 
                          girl.getName(), 
                          girl.getHeight(), 
                          girl.getBike().getModel());
        
        Person boy = new Person("", 0, 0, 'M', false);
        boy.setBike(cityBike);
        System.out.printf("La persona %s que medeix %f té una %s!!!\n", 
                          boy.getName(), 
                          boy.getHeight(), 
                          boy.getBike().getModel());

    }
}
