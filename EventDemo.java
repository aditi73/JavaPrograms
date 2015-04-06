import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class EventDemo extends Applet implements ActionListener
{
	TextField t1,t2,t3;Button sum,sub,div,mult;int i,j,res;
	public void init()
	{
		t3=new TextField(8);
		t2=new TextField(8);
		t1=new TextField(8);
		sum=new Button("Sum");
		sub=new Button("Sub");
		div=new Button("div");
		mult=new Button("Mult");
		add(t1);add(t2);add(t3);
		System.out.println("");
		add(sum);add(sub);add(div);add(mult);
		sum.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		i=Integer.parseInt(t1.getText());
		j=Integer.parseInt(t2.getText());
		if(ae.getSource()==sum)
		{
			res=i+j;
		}
		if(ae.getSource()==sub)
		{
			res=i-j;
		}
		if(ae.getSource()==mult)
		{
			res=i*j;
		}
		if(ae.getSource()==div)
		{
			res=i/j;
		}
		String str=Integer.toString(res);
		t3.setText(str);
	}	
}

