package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicismetodes;

import java.util.Scanner;

/**
 * Description: (Càrrecs d’estacionament) Un garatge cobra una tarifa mínima de
 * 2,00 dòlars per estacionar fins a tres hores. El garatge cobra 0,50 dòlars addicionals
 * per hora per cada hora o part d’ella per sobre de tres hores. El càrrec màxim per a un
 * període de 24 hores és de 10,00 USD. Podem suposar que no hi haurà cotxes aparcats
 * durant més de 24 hores. Escriviu una aplicació que calculi i mostri les despeses
 * d’aparcament del garatge. Haureu d'introduir les hores estacionades per a cada client.
 * El programa hauria de mostrar el càrrec del client actual i ha de calcular i mostrar
 * el total actual acumulat. Heu de crear el mètode calculateCharges per determinar
 * el càrrec per a cada client.
 * <p>
 * ENG: (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up
 * to three hours. The garage charges an additional $0.50 per hour for each hour or part
 * thereof in excess of three hours. The maximum charge for any given 24-hour period is
 * $10.00. Assume that no car parks for longer than 24 hours at a time. Write an application
 * that calculates and displays the parking charges for each customer who parked in the
 * garage yesterday. You should enter the hours parked for each customer. The program
 * should display the charge for the current customer and should calculate and display
 * the running total of yesterday’s receipts. It should use the method calculateCharges
 * to determine the charge for each customer.
 * Created:  16 nov. 2020
 *
 * @Author: xavier - xavier.sastre@cide.es
 * @Version: 1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciMetodes01 {
    private static final double BASE_FEE = 2.00;
    private static final double HOURLY_FEE = 0.50;
    private static final double MAX_FEE = 10.00;

    private static double total = 0.0f;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double time = 0.0f;

        do{
            time = requestInput("Enter hours parked (-1 to exit): ", sc);
            if(time > 0)
                System.out.printf("Charges: $%.2f\n", calculateCharges(time));

        }while(time != -1);

        System.out.printf("Total charges for the day: $%.2f\n", total);
    }
    public static double requestInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextDouble();
    }
    public static double calculateCharges(double time){
        if(time > 3.0){
            // Math.ceil to ensure an increase only for each additional hour
            double fee = BASE_FEE + (HOURLY_FEE * Math.ceil(time - 3.0));

            // return the min of fee and MAX_FEE to ensure daily cost
            // exceed specifiation
            total += Math.min(fee, MAX_FEE);
            return Math.min(fee, MAX_FEE);
        }else{
            total += BASE_FEE;
            return BASE_FEE;
        }
    }
}