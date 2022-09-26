import javax.swing.JFrame;

public class MainFrame extends JFrame {
    
    public MainFrame()
    {
        super("Simple Swing example"); //remember super calls title construcotr from JFrame
        MainPanel mp = new MainPanel();
        getContentPane().add(mp);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}
