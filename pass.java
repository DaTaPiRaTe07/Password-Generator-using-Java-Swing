import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class pdemo implements ActionListener
{
    JFrame f;
    JLabel txtpass;
    JTextField t;
    JButton G;
    JPanel p1,p2,p3;
    ButtonGroup bg;
    JCheckBox b6,b12,b8;
    pdemo()
    {
        f=new JFrame("Password Generator");
        p2=new JPanel();
        p1=new JPanel();
        p3=new JPanel();
        txtpass=new JLabel("Password Generated : ");
        t=new JTextField("Password appears here");
        t.setFont(new Font("Arial", Font.BOLD, 12));
        t.setHorizontalAlignment(JTextField.CENTER);
        G=new JButton("Generate");
        bg=new ButtonGroup();
        b6=new JCheckBox(" 6 Character");
        b8=new JCheckBox(" 8 Character");
        b12=new JCheckBox("12 Character");
        f.setLayout(new GridLayout(3,1));
        p1.setLayout(new FlowLayout(FlowLayout.CENTER,0,50));
        p2.setLayout(new GridLayout(3,1));
        p3.setLayout(new FlowLayout(FlowLayout.CENTER,0,50));
        bg.add(b6);
        bg.add(b8);
        bg.add(b12);
        p1.add(txtpass);
        p1.add(t);
        b6.setHorizontalAlignment(JCheckBox.CENTER);
        b8.setHorizontalAlignment(JCheckBox.CENTER);
        b12.setHorizontalAlignment(JCheckBox.CENTER);
        p2.add(b6);
        p2.add(b8);
        p2.add(b12);
        p3.add(G);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        G.addActionListener(this);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void passg(int x)
    {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789<>,.?/+_-*&^%$#@!=";
        StringBuffer sb = new StringBuffer();
        Random r = new Random();
        for(int i=0;i<x;i++)
        {
            sb.append(s.charAt(r.nextInt(s.length())));
        }
        t.setText(sb.toString());
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==G && b6.isSelected())
        {
            passg(6);
        }
        else if(ae.getSource()==G && b8.isSelected())
        {
            passg(8);
        }
        else if(ae.getSource()==G && b12.isSelected())
        {
            passg(12);
        }
        else
        {
            passg(8);
        }
    }
}
class pass
{
    public static void main(String[] args)
    {
        new pdemo();
    }
}