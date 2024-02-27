import java.util.Scanner;

public class UseDinnerParty{
    public static void main(String[] args){
        DinnerParty aDinnerParty = new DinnerParty(); // declares instance of DinnerParty class

        Scanner sc = new Scanner(System.in); // adds scanner

        System.out.println("Enter Number of guests for the party:");
        aDinnerParty.setNoOfGuests(sc.nextInt()); //sets noOfGuests off what user wants
        System.out.println("Enter the menu option: 1 for beef or 2 for lamb.");
        aDinnerParty.setDinnerChoice(sc.nextInt()); //sets dinnerChoice off what user wants
        System.out.println("Enter your favorite drink.");
        aDinnerParty.setFavDrink(sc.next()); //sets favDrink off what user wants

        System.out.println("The party has " + aDinnerParty.getNoOfGuests() + " guests"); //displays amount of guests using get method and prints
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served"); //displays dinner choice using get method and prints
        System.out.println(aDinnerParty.getFavDrink() + " will be there!"); //displays favorite drink using get method and prints
        aDinnerParty.displayInvitation(); //displays invitation
    }
}
