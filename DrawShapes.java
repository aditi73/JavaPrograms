import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class DrawShapes extends Applet implements ActionListener
{
	Button sq,rect,cir;TextField t;String color,shape;
	public void init()
	{
		sq=new Button("Square");
		rect=new Button("Rectangle");
		cir=new Button("Circle"); 
		t=new TextField(8);
		add(t);
		add(sq);
		add(rect);
		add(cir);
		sq.addActionListener(this);
		rect.addActionListener(this);
		cir.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource == sq)
		{
			shape="square";
		}	
		if (ae.getSource == rect)
		{
			shape="rectangle";
		}		
		if (ae.getSource == cir)
		{
			shape="circle";
		}	
	}
	public void paint(Graphics g)
	{
		color=t.getText();
		g.setColor(color);
		g.draw3DRect(30,30.3

			)
	}
