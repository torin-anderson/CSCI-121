import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pizzaApplication extends JFrame implements ActionListener{
    final int FRAME_WIDTH = 350;
    final int FRAME_HEIGHT = 400;
    public float totalPrice = 0;
    JLabel finalAmount;
    public pizzaApplication(){
        //sets up GUI
        setLayout(new FlowLayout());
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creates the title
        JLabel title = new JLabel("Big Y Pizza Shop");
        title.setFont(new Font("Courier New", Font.BOLD, 30));
        title.setForeground(Color.RED);
        add(title);

        //blank label to help separate items
        JLabel blank1 = new JLabel("                                                                                                                                             ");
        add(blank1);

        //designs the label and combobox to choose pizza size
        JLabel sizeLabel = new JLabel("Pizza Size:   ");
        sizeLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        add(sizeLabel); //adds label

        String[] sizeChoices = { "Pick a Size", "Small $5.00","Medium $10.00", "Large $15.00","Super $20.00"}; //choices for size
        JComboBox pizzaSizes = new JComboBox(sizeChoices);
        pizzaSizes.setFont(new Font( "Courier New", Font.PLAIN, 15));
        add(pizzaSizes); //adds combobox
        pizzaSizes.addActionListener(this); //adds actionlistener to help determine final cost based on selection

        //designs the label to tell about toppings
        JLabel toppingLabel = new JLabel("Toppings ($0.50 each, 3 for $1.25):");
        toppingLabel.setFont(new Font("Courier New", Font.BOLD, 15));
        add(toppingLabel); //adds label

        //choices for toppings
        String[] toppingChoices = { "Pick a Topping", "Ham $0.50", "Sausage $0.50","Pepperoni $0.50", "Mushrooms $0.50", "Onions $0.50", "Peppers $0.50", "Chicken $0.50"};

        //creates comboboxes for choosing toppings
        JComboBox topping1 = new JComboBox(toppingChoices);
        topping1.setFont(new Font( "Courier New", Font.PLAIN, 12));
        add(topping1); //adds first topping box
        topping1.addActionListener(this); //adds actionlistener to help determine final cost based on selection

        JComboBox topping2 = new JComboBox(toppingChoices);
        topping2.setFont(new Font( "Courier New", Font.PLAIN, 12));
        add(topping2); //adds second topping box
        topping2.addActionListener(this); //adds actionlistener to help determine final cost based on selection

        //discounted topping prices because of third
        String[] thirdToppingChoices = { "Pick a Topping", "Ham $0.25", "Sausage $0.25","Pepperoni $0.25", "Mushrooms $0.25", "Onions $0.25", "Pepper $0.25", "Chicken $0.25"};
        JComboBox topping3 = new JComboBox(thirdToppingChoices);
        topping3.setFont(new Font( "Courier New", Font.PLAIN, 12));
        add(topping3); //adds third topping box
        topping3.addActionListener(this); //adds actionlistener to help determine final cost based on selection

        //gives the user the choice for extra cheese free of charge
        String[] cheeseChoice = { "No Extra Cheese", "Extra Cheese"};
        JComboBox cheeseAmount = new JComboBox(cheeseChoice);
        cheeseAmount.setFont(new Font( "Courier New", Font.PLAIN, 12));
        add(cheeseAmount); //adds third topping box

        //blank label to help separate items
        JLabel blank2 = new JLabel("                                                                                                                          ");
        add(blank2);

        //designs the label to tell about sides
        JLabel sidesLabel = new JLabel("Sides:   ");
        sidesLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        add(sidesLabel); //adds label

        //choices for sides
        String[] sidesChoices = { "Pick a Side", "Mozzarella Sticks $6","Chicken Wings $8", "Buffalo Wings $9","Fries $4"};
        //creates comboboxes for choosing a side
        JComboBox sides = new JComboBox(sidesChoices);
        sides.setFont(new Font( "Courier New", Font.PLAIN, 12));
        add(sides); //adds first topping box
        sides.addActionListener(this); //adds actionlistener to help determine final cost based on selection

        //blank label to help separate items
        JLabel blank3 = new JLabel("                                                                       ");
        add(blank3);

        //creates label that displays the total amount
        finalAmount = new JLabel();
        finalAmount.setFont(new Font("Courier New", Font.BOLD, 20));
        add(finalAmount); //adds label

    }

    public static void main(String[] args) {
        pizzaApplication example = new pizzaApplication();
        example.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JComboBox cb=(JComboBox)e.getSource(); //gets selected value in the combobox
        Object newItem = cb.getSelectedItem(); //saves selected value
        int pos = newItem.toString().indexOf("$") + 1; //Finding where dollar sign exists in the saved string
        totalPrice += Float.parseFloat(newItem.toString().substring(pos)); //adds new item to the current total
        finalAmount.setText("   Total:  " + totalPrice); //displays total amount
    }
}
