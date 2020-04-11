import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RPS extends Frame
{
	JFrame f;
	JTextField tf1,tf2;
	String name1,name2;
	RPS()
	{
		f=new JFrame("RPSGame");
		JLabel l1=new JLabel("Enter names of ");
		l1.setBounds(100,30,200,20);
		JLabel l2=new JLabel("Player1:");
		l2.setBounds(100,60,100,20);
		JTextField tf1=new JTextField();
		tf1.setBounds(130,90,100,20);
		JLabel l3=new JLabel("Player2:");
		l3.setBounds(100,120,100,20);
		JTextField tf2=new JTextField();
		tf2.setBounds(130,150,100,20);
		JButton b=new JButton("OK");
		b.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e)
	{
		name1=tf1.getText();
		name2=tf2.getText();
		new RPS1(name1,name2,0,0);
		f.setVisible(false);
	}});
		b.setBounds(140,180,70,30);
		f.setLayout(null);
		f.add(l1);f.add(l2);f.add(tf1);f.add(l3);f.add(tf2);f.add(b);
		f.setSize(400,400);
		f.setVisible(true);
		//name1=tf1.getText();
		//name2=tf2.getText();
	}
	public static void main(String []args)
	{
		new RPS();
	}
	
}