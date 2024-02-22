import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        int num_counter = 0; //counter used for the while loop and adding to the correct array index
        double userInput; // used for taking in number the user wants to input
        Scanner sc = new Scanner(System.in); //implementing the scanner

        System.out.println("How many numbers do you want to add?");
        int arraySize = sc.nextInt(); // takes in what array size the user wants

        //if user wants a length over 20 then the program ends
        if (arraySize > 20){
            System.exit(0);
        }

        double[] list = new double[arraySize];//creates array with size inputted

        //adds numbers to the array that the user wants
        while (num_counter < arraySize){
            System.out.println("Enter value to add to array");
            userInput = Double.parseDouble(sc.next()); //takes in the double the user wants
            list[num_counter] = userInput; // adds the double to the correct party of the array
            num_counter += 1; //counter goes up so infinite loop doesn't exist and so that the next spot will be added to in the array
        }

        System.out.println(Arrays.toString(list));
    }
}