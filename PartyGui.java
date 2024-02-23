import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PartyGui extends JFrame implements ActionListener{
    final int FRAME_WIDTH = 300;
    final int FRAME_HEIGHT = 400;
    DinnerParty aDinnerParty = new DinnerParty();
    JTextField noOfGuestsField;
    JRadioButton option1;
    JRadioButton option2;
    JLabel menu;
    JLabel guests;
    JButton loadInvite;
    public PartyGui() {
        //sets up GUI
        setLayout(new FlowLayout());
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.BLACK);

        //creates the title
        JLabel title = new JLabel("Dinner Party!!!");
        title.setFont(new Font("Courier New", Font.BOLD, 30));
        title.setForeground(Color.yellow);
        add(title);

        JLabel noOfGuestsLabel = new JLabel("Enter Number of guests for the party: ");
        noOfGuestsLabel.setFont(new Font("Courier New", Font.BOLD, 10));
        noOfGuestsLabel.setForeground (Color.white);
        add(noOfGuestsLabel); //adds label

        noOfGuestsField = new JTextField("    ");
        add(noOfGuestsField);

        JLabel menuOptionLabel = new JLabel("Enter the menu option: 1 for beef or 2 for lamb.");
        menuOptionLabel.setFont(new Font("Courier New", Font.BOLD, 10));
        menuOptionLabel.setForeground (Color.white);
        add(menuOptionLabel); //adds label

        option1 = new JRadioButton();
        option1.setText("Option 1");
        add(option1);

        option2 = new JRadioButton();
        option2.setText("Option 2");
        add(option2);

        loadInvite = new JButton("Click");
        add(loadInvite);
        loadInvite.addActionListener(this);


        guests = new JLabel();
        menu = new JLabel();
        guests.setForeground (Color.red);
        menu.setForeground (Color.green);
        add(guests);
        add(menu);
    }

    public static void main(String[] args) {
        PartyGui example = new PartyGui();
        example.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadInvite) {
            if (option1.isSelected()){

                aDinnerParty.setDinnerChoice(1);
                menu.setText("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");

                aDinnerParty.setNoOfGuests(Integer.parseInt(noOfGuestsField.getText().strip()));
                guests.setText("The party has " + aDinnerParty.getNoOfGuests() + " guests");
            }
            else{
                aDinnerParty.setDinnerChoice(2);
                menu.setText("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");

                aDinnerParty.setNoOfGuests(Integer.parseInt(noOfGuestsField.getText()));
                guests.setText("The party has " + aDinnerParty.getNoOfGuests() + " guests");
            }
        }
    }
}