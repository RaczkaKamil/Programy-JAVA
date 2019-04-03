import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Main extends JFrame implements ActionListener {
    public Main()
    {

        setSize(600,500);
        setTitle(" Sklep ");



    }

    public Main(GraphicsConfiguration gc) {
        super(gc);
    }

    public Main(String title) throws HeadlessException {
        super(title);
    }

    public Main(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        Main m= new Main();

        m.setVisible(true);
        m.add(new JLabel(new ImageIcon("111.png")));
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
