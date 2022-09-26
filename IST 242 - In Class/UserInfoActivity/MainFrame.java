import javax.swing.JFrame;

public class MainFrame extends JFrame {
    
    public MainFrame()
    {
        super("Information Collector");
        MainPanel mp = new MainPanel();
        getContentPane().add(mp);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
