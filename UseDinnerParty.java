import java.util.Scanner;

public class UseDinnerParty{
    public static void main(String[] args){
        DinnerParty aDinnerParty = new DinnerParty();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of guests for the party:");
        aDinnerParty.setNoOfGuests(sc.nextInt());
        System.out.println("Enter the menu option: 1 for beef or 2 for lamb.");
        aDinnerParty.setDinnerChoice(sc.nextInt());

        System.out.println("The party has " + aDinnerParty.getNoOfGuests() + " guests");
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");
        aDinnerParty.displayInvitation();
    }
}
