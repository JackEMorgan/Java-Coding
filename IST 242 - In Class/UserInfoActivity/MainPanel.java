import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel implements ActionListener {
    private JLabel fnamePromptLabel = null;
    private JLabel lnamePromptLabel = null;
    private JLabel streetPromptLabel = null;
    private JLabel cityPromptLabel = null;
    private JLabel statePromptLabel = null;
    private JLabel zipPromptLabel = null;
    private JTextField fnameField = null;
    private JTextField lnameField = null;
    private JTextField streetField = null;
    private JTextField cityField = null;
    private JTextField stateField = null;
    private JTextField zipField = null;
    private JButton greetButton = null;

    private JLabel outputLabel = null;

    public MainPanel()
    {
        //First Name Label
        fnamePromptLabel = new JLabel();
        fnamePromptLabel.setText("Enter your first name: ");
        add(fnamePromptLabel);

        //First Name Field
        fnameField = new JTextField(25);
        add(fnameField);

        //Last Name Label
        lnamePromptLabel = new JLabel();
        lnamePromptLabel.setText("Enter your last name: ");
        add(lnamePromptLabel);

        //Last Name Field
        lnameField = new JTextField(25);
        add(lnameField);

        //Street Label
        streetPromptLabel = new JLabel();
        streetPromptLabel.setText("Enter your street: ");
        add(streetPromptLabel);

        //Street Field
        streetField = new JTextField(25);
        add(streetField);

        //City Label
        cityPromptLabel = new JLabel();
        cityPromptLabel.setText("Enter your city: ");
        add(cityPromptLabel);

        //City Field
        cityField = new JTextField(25);
        add(cityField);

        //State Label
        statePromptLabel = new JLabel();
        statePromptLabel.setText("Enter your state: ");
        add(statePromptLabel);

        //State Field
        stateField = new JTextField(25);
        add(stateField);

        //Zip Label
        zipPromptLabel = new JLabel();
        zipPromptLabel.setText("Enter your zip code: ");
        add(zipPromptLabel);

        //Zip Field
        zipField = new JTextField(25);
        add(zipField);

        //Output Label
        outputLabel = new JLabel();
        outputLabel.setText(" -- output will show here -- ");
        add(outputLabel);

        //Greet/Output Button
        greetButton = new JButton("Greet user");
        greetButton.addActionListener(this);
        add(greetButton);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == greetButton)
        {
            outputLabel.setText("Hello there, " + fnameField.getText() + " " +lnameField.getText() + "!");
        }
    }
}
