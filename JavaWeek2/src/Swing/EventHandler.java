package Swing;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener
{
	TextField t1,t2,t3;
	Label l1;
	EventHandler(TextField t1,TextField t2,TextField t3)
	{
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		int total = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
		t3.setText(Integer.toString(total));
	}
	


}
