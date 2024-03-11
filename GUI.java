import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.UIManager;

public class GUI {
    public static void main(String[] args){
        //variables and instances
        ShoppingCart shop = new ShoppingCart();
        boolean keepShopping = true;
        String userInput;
        int cartItem;
        int totalAmount = 0;

        //used to change color of background
        UIManager ui = new UIManager();
        UIManager.put("OptionPane.background", Color.red);

        //implements try and catch
        try{
            while (keepShopping) {
                //asks user what they want to do
                userInput = JOptionPane.showInputDialog("What action? (Add, Remove, Search, Total Amount, End)");

                //finds what user chose to do
                if (userInput.equals("End")) {
                    //ends program
                    JOptionPane.showMessageDialog(null, "All items will be ordered");
                    keepShopping = false;
                }else if (userInput.equals("Total Amount")) {
                    //prints total current amount
                    JOptionPane.showMessageDialog(null, "Your total is: " + totalAmount);
                }else if (userInput.equals("Search")){
                    //finds requested item
                    cartItem = Integer.parseInt(JOptionPane.showInputDialog("Which number item in your cart would you like to view?"));
                    JOptionPane.showMessageDialog(null, "Item " + cartItem + " is " + shop.cart.get(cartItem-1));
                }else if (userInput.equals("Remove")){
                    //removes requested item
                    cartItem = Integer.parseInt(JOptionPane.showInputDialog("Which number item in your cart would you like to remove?"));
                    JOptionPane.showMessageDialog(null, "Item " + cartItem + " is removed");
                    shop.cart.remove(cartItem-1);
                }else if (userInput.equals("Add")){
                    //adds whatever item the user chooses
                    shop.setItem(JOptionPane.showInputDialog("Would you like to buy tissues($3) spoons($5) or books($8)?"));
                    shop.setQuantity(Integer.parseInt(JOptionPane.showInputDialog("How many?")));
                    //finds right amount to add
                    if (Objects.equals(shop.getItem(), "tissues")){
                        totalAmount += shop.getQuantity() * 3;
                        shop.cart.add(shop.getItem() + " " + shop.getQuantity() + " $" + shop.getQuantity() * 8);
                    }else if (Objects.equals(shop.getItem(), "spoons")){
                        totalAmount += shop.getQuantity() * 5;
                        shop.cart.add(shop.getItem() + " " + shop.getQuantity() + " $" + shop.getQuantity() * 8);
                    }else if (Objects.equals(shop.getItem(), "books")){
                        totalAmount += shop.getQuantity() * 8;
                        shop.cart.add(shop.getItem() + " " + shop.getQuantity() + " $" + shop.getQuantity() * 8);
                    }
                    JOptionPane.showMessageDialog(null, shop.getItem() + " has been added");
                }
            }
        }catch( NumberFormatException exception){
            //catches if a user tries to input something that is not an int
            JOptionPane.showMessageDialog(null, "Only whole numbers, try again");
        }catch(IndexOutOfBoundsException exception){
            //catches if user tries to search or remove item that doesn't exist
            JOptionPane.showMessageDialog(null, "Only numbers in range, try again");
        }catch(Exception exception){
            JOptionPane.showMessageDialog(null, "nuh uh");
        }
    }
}
