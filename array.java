import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int num_counter = 0;
        int userInput = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to add?");
        int arraySize = sc.nextInt();
        int[] list = new int[arraySize];

        while (num_counter < arraySize){
            System.out.println("Enter value to add to array");
            userInput = sc.nextInt();
            list[num_counter] = userInput;
            num_counter += 1;
        }

        System.out.println(Arrays.toString(list));
    }
}