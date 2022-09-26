import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel implements ActionListener{
    private JLabel namePromptLabel = null;
    private JTextField nameField = null;
    private JButton greetButton = null;
    
    private JLabel outputLabel = null;

    public MainPanel()
    {

        namePromptLabel = new JLabel();
        namePromptLabel.setText("Enter your name:");
        add(namePromptLabel);
        
        nameField = new JTextField(25);
        add(nameField);
        
        outputLabel = new JLabel();
        outputLabel.setText(" -- output will go here -- ");
        add(outputLabel);
        
        greetButton = new JButton("Greet user");
        greetButton.addActionListener(this);
        add(greetButton);
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == greetButton)
        {
            outputLabel.setText("Hello there, " + nameField.getText() + "!");
        }
    }
}
