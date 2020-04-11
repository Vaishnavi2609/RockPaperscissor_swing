import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RPS2 extends Frame implements ActionListener
{
	JFrame f;
	int num,score1,score2;
	String name1,name2,str;
	RPS2(String name1,String name2,int num,int score1,int score2)
	{
		this.name1=name1;
		this.name2=name2;
		this.score1=score1;
		this.score2=score2;
		this.num=num;
		f=new JFrame("RSPGame");
		if(num==2)
			str="Rock";
		else
			str=(num==0)?"Paper":"Scissor";
		JLabel l1=new JLabel(name1+" got : "+str);
		l1.setBounds(100,30,200,20);
		JLabel l2=new JLabel(name2+" click the dice to play");
		l2.setBounds(100,60,200,20);
		JButton b=new JButton(new ImageIcon("D:\\dice.png"));
		b.addActionListener(this);
		b.setBounds(140,90,80,80);
		f.add(l1);f.add(l2);f.add(b);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		int num1=((int)(Math.random()*10))%3;
		if((num==2&&num1==1)||(num==1&&num==2))
		{
			if(num==1)
				score2++;
			else
				score1++;
		}
		else if((num==2&&num1==0)||(num==0&&num1==2))
		{
			if(num==0)
				score1++;
			else
				score2++;
		}
		else if((num==0&&num1==1)||(num1==0&&num==1))
		{
			if(num==0)
				score2++;
			else
				score1++;
		}
		f.setVisible(false);
		new RPS3(name1,name2,num1,score1,score2);
	}
}