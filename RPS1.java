import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RPS1 extends Frame implements ActionListener
{
	JFrame f;
	String name1,name2;
	int score1,score2;
	RPS1(String name1,String name2,int score1,int score2)
	{
		this.name1=name1;
		this.name2=name2;
		this.score1=score1;
		this.score2=score2;
		f=new JFrame("RSPGame");
		JLabel l1=new JLabel(name1+" Score : "+score1);
		l1.setBounds(100,30,200,20);
		JLabel l2=new JLabel(name2+" Score : "+score2);
		l2.setBounds(100,60,200,20);
		JLabel l3=new JLabel(name1+" click the dice to play");
		l3.setBounds(100,90,200,20);
		JButton b=new JButton(new ImageIcon("D:\\dice.png"));
		b.setBounds(140,120,80,80);
		b.addActionListener(this);
		f.add(l1);f.add(l2);f.add(l3);f.add(b);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		int num=(int)(Math.random()*10)%3;
		f.setVisible(false);
		new RPS2(name1,name2,num,score1,score2);
	}
}