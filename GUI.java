import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import javax.swing.UIManager;

public class GUI {
    public static void main(String[] args){
        //variables and instances
        Pizza pizza = new Pizza();
        DeliveryPizza dPizza = new DeliveryPizza();
        int num_counter = 0;
        String userInput;
        String[] toppings;
        String[] finalToppings;
        boolean delivery;
        int tip;

        //used to change color of background
        UIManager ui = new UIManager();
        ui.put("OptionPane.background", Color.blue);

        //implements try and catch
        try{
            //sets number of pizza toppings
            pizza.setNumberPizzaToppings(Integer.parseInt(JOptionPane.showInputDialog("How many toppings?")));
            if (pizza.getNumberPizzaToppings() > 10){
                JOptionPane.showMessageDialog(null, "Too many toppings try again");
                System.exit(0);
            }
            toppings = new String[pizza.getNumberPizzaToppings()];//creates array with size inputted
            //determines if delivery will happen through boolean
            delivery = Boolean.parseBoolean(JOptionPane.showInputDialog("Do you want delivery (true or false)?"));

            //adds toopings to the array that the user wants
            while (num_counter < pizza.getNumberPizzaToppings()){
                userInput = JOptionPane.showInputDialog("What topping?");

                //if user chooses to quit while loop will end premptively and move on from adding toppings
                if (userInput.equals("QUIT")){
                    //reestablishes topping amount and cost of pizza alone
                    finalToppings = new String[num_counter];
                    finalToppings = Arrays.copyOfRange(toppings, 0, num_counter);
                    pizza.setPizzaToppings(finalToppings);
                    pizza.setCost(finalToppings.length);
                    // if user chooses to deliver takes into account the price of delivery
                    if (delivery == true){
                        dPizza.setAddy(JOptionPane.showInputDialog("What is your address?"));
                        if (pizza.getCost() > 18){
                            dPizza.setdCost(3); //if cost is over 18 then fee is 3
                        }else{
                            dPizza.setdCost(5); // otherwise it is 5
                        }
                        //allows user to tip and then shows everything about the order the user chose to do
                        tip = Integer.parseInt(JOptionPane.showInputDialog("Would you like to tip?"));
                        JOptionPane.showMessageDialog(null, "The Pizza will cost " + (pizza.getCost() + dPizza.getdCost() + tip) + " with the toppings " + Arrays.toString(pizza.getPizzaToppings()) + " to the address " + dPizza.getAddy());
                    }else{
                        //allows user to tip and then shows everything about the order the user chose to do
                        tip = Integer.parseInt(JOptionPane.showInputDialog("Would you like to tip?"));
                        JOptionPane.showMessageDialog(null, "The Pizza will cost " + (pizza.getCost() + tip) + " with the toppings " + Arrays.toString(pizza.getPizzaToppings()));
                    }
                    System.exit(0); //exits prematurely
                }

                toppings[num_counter] = userInput; // adds the topping to the correct part of the array
                num_counter += 1; //counter goes up so infinite loop doesn't exist and so that the next spot will be added to in the array
            }

            //establishes toppings and price of pizza alone
            pizza.setPizzaToppings(toppings);
            pizza.setCost(toppings.length);

            // if user chooses to deliver takes into account the price of delivery
            if (delivery == true){
                dPizza.setAddy(JOptionPane.showInputDialog("What is your address?"));
                if (pizza.getCost() > 18){
                    dPizza.setdCost(3); //if cost is over 18 then fee is 3
                }else{
                    dPizza.setdCost(5); // otherwise it is 5
                }
                //allows user to tip and then shows everything about the order the user chose to do
                tip = Integer.parseInt(JOptionPane.showInputDialog("Would you like to tip?"));
                JOptionPane.showMessageDialog(null, "The Pizza will cost " + (pizza.getCost() + dPizza.getdCost() + tip) + " with the toppings " + Arrays.toString(pizza.getPizzaToppings()) + " to the address " + dPizza.getAddy());
            }else{
                //allows user to tip and then shows everything about the order the user chose to do
                tip = Integer.parseInt(JOptionPane.showInputDialog("Would you like to tip?"));
                JOptionPane.showMessageDialog(null, "The Pizza will cost " + (pizza.getCost() + tip) + " with the toppings " + Arrays.toString(pizza.getPizzaToppings()));
            }
        }catch( NumberFormatException exception){
            //catches if a user tries to input something that is not an int
            JOptionPane.showMessageDialog(null, "Only whole numbers, try again");
        } catch (Exception exception){
            //catches all other errors
            JOptionPane.showMessageDialog(null,"Blud went crazy");
        }
    }
}