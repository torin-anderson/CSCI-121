import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PartyGui extends JFrame implements ActionListener{
    //width and height of gui
    final int FRAME_WIDTH = 300;
    final int FRAME_HEIGHT = 400;
    DinnerParty aDinnerParty = new DinnerParty(); //instance of dinnerParty class
    JTextField noOfGuestsField;
    JTextField favDrinkField;
    JRadioButton option1;
    JRadioButton option2;
    JLabel menu;
    JLabel guests;
    JLabel drink;
    JButton loadInvite;
    JLabel partyInvite;
    public PartyGui() {
        //sets up GUI
        setLayout(new FlowLayout());
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.BLACK);//sets background color

        //creates the title
        JLabel title = new JLabel("Dinner Party!!!");
        title.setFont(new Font("Courier New", Font.BOLD, 30));
        title.setForeground(Color.yellow);
        add(title);

        //creates label asking for number of guests
        JLabel noOfGuestsLabel = new JLabel("Enter number of guests for the party: ");
        noOfGuestsLabel.setFont(new Font("Courier New", Font.BOLD, 10));
        noOfGuestsLabel.setForeground (Color.white);
        add(noOfGuestsLabel); //adds label

        //text field to get user input
        noOfGuestsField = new JTextField("     ");
        add(noOfGuestsField);

        //creates label asking for favorite drink
        JLabel favDrinkLabel = new JLabel("Enter fav drink: ");
        favDrinkLabel.setFont(new Font("Courier New", Font.BOLD, 10));
        favDrinkLabel.setForeground (Color.white);
        add(favDrinkLabel); //adds label

        //text field to get user input for favorite drink
        favDrinkField = new JTextField("               ");
        add(favDrinkField);

        //creates label asking for dinner choice
        JLabel menuOptionLabel = new JLabel("Enter the menu option: 1 for beef or 2 for lamb.");
        menuOptionLabel.setFont(new Font("Courier New", Font.BOLD, 10));
        menuOptionLabel.setForeground (Color.white);
        add(menuOptionLabel); //adds label

        //creates radio buttons to choose which dinner option
        option1 = new JRadioButton();
        option1.setText("Option 1");
        add(option1);

        option2 = new JRadioButton();
        option2.setText("Option 2");
        add(option2);

        //creates button which will cause print out number of guests, dinner option, and dinner invite
        loadInvite = new JButton("Click");
        add(loadInvite);
        loadInvite.addActionListener(this);


        //creates labels to show number of guests and dinner option chosen, along with dinner invite
        guests = new JLabel();
        menu = new JLabel();
        drink = new JLabel();
        partyInvite = new JLabel();
        guests.setForeground (Color.red);
        menu.setForeground (Color.green);
        drink.setForeground(Color.CYAN);
        partyInvite.setForeground(Color.PINK);
        add(guests);
        add(menu);
        add(drink);
        add(partyInvite);
    }

    public static void main(String[] args) {
        //creates gui
        PartyGui example = new PartyGui();
        example.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //when the button is clicked determines which radio button was selected
        if(e.getSource() == loadInvite) {
            if (option1.isSelected()){
                //if first was selected dinerChoice reflects that
                aDinnerParty.setDinnerChoice(1);
                menu.setText("Menu option " + aDinnerParty.getDinnerChoice() + " will be served.");
                aDinnerParty.setNoOfGuests(Integer.parseInt(noOfGuestsField.getText().strip()));
                guests.setText("The party has " + aDinnerParty.getNoOfGuests() + " guests.");
                aDinnerParty.setFavDrink(favDrinkField.getText().strip());
                drink.setText(aDinnerParty.getFavDrink() + " will be there!");
                partyInvite.setText("Please come to my party!");
            }
            else{
                //if first wasn't selected dinerChoice reflects that
                aDinnerParty.setDinnerChoice(2);
                menu.setText("Menu option " + aDinnerParty.getDinnerChoice() + " will be served.");
                aDinnerParty.setNoOfGuests(Integer.parseInt(noOfGuestsField.getText()));
                guests.setText("The party has " + aDinnerParty.getNoOfGuests() + " guests.");
                aDinnerParty.setFavDrink(favDrinkField.getText().strip());
                drink.setText(" " + aDinnerParty.getFavDrink() + " will be there!");
                partyInvite.setText("Please come to my party!");
            }
        }
    }
}