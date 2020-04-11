import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class RPS4 extends Frame implements ActionListener
{
	JFrame f;
	RPS4(String name1,String name2,int score1,int score2)
	{
		f=new JFrame();
		JDialog d=new JDialog(f,"RPSResult",true);
		JLabel l1=new JLabel(name1+" Score : "+score1);
		l1.setBounds(100,30,200,20);
		JLabel l2=new JLabel(name2+" Score : "+score2);
		l2.setBounds(100,60,200,20);
		JButton b=new JButton("OK");
		b.setBounds(170,90,70,20);
		b.addActionListener(this);
		f.add(l1);f.add(l2);f.add(b);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		f.setVisible(false);
	}
}