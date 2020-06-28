import assignment2.Flower;
import assignment2.Lily;
import assignment2.Rose;
import assignment2.Tulip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI implements ActionListener
{   
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel title;
    private static JLabel l;
    private static JButton b;
    private static JButton b1;
    private static JButton b2;
    private static JButton b3;
    
    public static void main (String[] args)
    {        
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(550, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome to GFRIEND Garden");
        frame.add(panel);        
    
        panel.setLayout(null);
        
        title = new JLabel("Flower");
        title.setFont(new Font ("Courgette", Font.BOLD , 50));
        title.setForeground(Color.magenta);
        title.setBounds(170, 20, 350, 70);
        panel.add(title);
        
        l = new JLabel("Please click a button to know more about the Flower.");
        l.setFont(new Font ("Arial", Font.PLAIN , 20));
        l.setBounds(30, 100, 700, 50);
        panel.add(l);
        
        b = new JButton("Flower's common");
        b.setBounds(140, 200, 250, 25);
        b.addActionListener(new GUI());
        panel.add(b);
        
        b1 = new JButton("Tulip");
        b1.setBounds(140, 300, 250, 25);
        b1.addActionListener(new GUI());
        panel.add(b1);
        
        b2 = new JButton("Lily");
        b2.setBounds(140, 400, 250, 25);
        b2.addActionListener(new GUI());
        panel.add(b2);
        
        b3 = new JButton("Rose");
        b3.setBounds(140, 500, 250, 25);
        b3.addActionListener(new GUI());
        panel.add(b3);
        
        frame.setVisible(true);
    }
        
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b)
        {
            Flower f = new Flower();
            f.setVisible(true);
        }
        else if (e.getSource() == b1)
        {
            Tulip f1 = new Tulip();
            f1.setVisible(true);
        }
        else if (e.getSource() == b2)
        {
            Lily f2 = new Lily();
            f2.setVisible(true);
        }
        else if (e.getSource() == b3)
        {
            Rose f3 = new Rose();
            f3.setVisible(true);
        }
        
    void setVisible(boolean b){
        frame.setVisible(true);
  
    }
    
}

}