import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RPS3 extends Frame implements ActionListener
{
	JFrame f;
	JButton b2,b1;
	String str,name1,name2;
	int score1,score2,num1;
	RPS3(String name1,String name2,int num1,int score1,int score2)
	{
		this.name1=name1;
		this.name2=name2;
		this.score1=score1;
		this.score2=score2;
		this.num1=num1;
		f=new JFrame("RSPGame");
		if(num1==2)
			 str="Rock";
		else
			 str=((num1==1)?"Scissor":"Paper");
		JLabel l1=new JLabel(name2+" got : "+str);
		l1.setBounds(100,30,200,20);
		JLabel l2=new JLabel("Do you want to continue or cancel the game?");
		l2.setBounds(50,60,300,20);
		b1=new JButton("Continue");
		b1.addActionListener(this);
		b1.setBounds(60,90,100,30);
		b2=new JButton("Cancel");
		b2.setBounds(220,90,80,30);
		b2.addActionListener(this);
		f.add(l1);f.add(l2);f.add(b1);f.add(b2);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b2)
		{
			f.setVisible(false);
			new RPS4(name1,name2,score1,score2);
		}
		if(e.getSource()==b1)
		{
			f.setVisible(false);
			new RPS1(name1,name2,score1,score2);
		}
	}
			
	
}