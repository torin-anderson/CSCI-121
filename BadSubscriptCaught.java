import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        //creates the starts variables and scanner
        Scanner sc = new Scanner(System.in);
        String[] array = {"Joe", "Loe", "Moe", "Soe", "Doe", "Koe", "Coe", "Zoe", "Noe", "Goe" };
        int userInput;
        try{
            //tries to run code where user inputs to reach name from array
            System.out.println("Input index number to access name");
            userInput = sc.nextInt();
            System.out.println(array[userInput]);
        } catch( ArrayIndexOutOfBoundsException exception){
            //catches array index out of bounds error
            System.out.println("Index is out of bounds, try again");
        } catch (Exception exception){
            //catches all other errors
            System.out.println("Blud went crazy");
        }
    }
}