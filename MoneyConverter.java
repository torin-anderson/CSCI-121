import java.util.Scanner;
import java.lang.Math;
public class MoneyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String money_with_sign = sc.nextLine(); //Takes the inputted amount of money into a variable
        double money = Double.parseDouble(money_with_sign.replace("$", "")); //turns inputted amount to a double

        //Converts the USD inputted to different currencies
        double yen = money * 148.13;
        double pesos  = money * 17.19;
        double rupees = money * 83.11;
        double pounds = money * .79;
        double can = money * 1.35;
        double aud = money * 1.52;

        //Converts the USD inputted to quarters, dimes, nickels, and pennies
        int quarters = (int)(money/.25); //Amount of quarters
        money = Math.round((money % .25) * 100)/100.00; //Creates remainder of money left after quarters
        int dimes = (int)(money / .1); //Amount of dimes
        money = Math.round((money % .1) * 100)/100.00; //Creates remainder of money left after dimes
        int nickels = (int)(money / .05); //Amount of nickels
        money = Math.round((money % .05) * 100)/100.00; //Creates remainder of money left after nickels
        int pennies = (int)(money / .01); //Amount of pennies

        //Prints all the currencies and change amounts
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        System.out.println("Yen: " + (Math.round(yen * 100))/100.00);
        System.out.println("Pesos: " + (Math.round(pesos * 100))/100.00);
        System.out.println("Rupees: " + (Math.round(rupees * 100))/100.00);
        System.out.println("Pounds: " + (Math.round(pounds * 100))/100.00);
        System.out.println("Canadian Dollars: " + (Math.round(can * 100))/100.00);
        System.out.println("Australian Dollars: " + (Math.round(aud * 100))/100.00);
    }
}