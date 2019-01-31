package Calculator;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class NumericButton extends Button
{
	private TextField displayLocation;

	//improvements make the textfield static since we only use one
	
	private boolean operator=false;
	NumericButton(String name, TextField label  )
	{
		displayLocation = label;
		setLabel(name);	
		addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{		
				if(!operator)
				{
					
					displayLocation.setText(displayLocation.getText() + getLabel());
				}
				else
				{
					operation();
				}
			}	
		});
	}
	public void setOperator(boolean operator) 
	{
		this.operator = operator;
	}
	
	private void operation()
	{
		switch(getLabel())
		{
			case "c": emptyCalculator();
			break;
			case "=": calc();
			break;			
		}
	}
	public void emptyCalculator()
	{
		displayLocation.setText("");

	}
	public void calc()
	{
		List<Integer> numbersList = new ArrayList<Integer>();
		List<Character> operatorList = new ArrayList<Character>();
		String nums = "";
		
		String full = displayLocation.getText();
		for(int count= 0 ;count < full.length();count++ )
		{
			if(full.charAt(count)=='+' |full.charAt(count)== '-'| full.charAt(count)== 'X'| full.charAt(count)== '/')
			{
				if(nums!="")
				{
					numbersList.add(Integer.parseInt(nums));
					operatorList.add((full.charAt(count)));
					nums="";
				}
				else
				{
					if((full.charAt(count)== '+') | full.charAt(count)== '-')
					{
						if(nums.equals("-") || nums.equals("+"))
						{
							nums += full.charAt(count);						
						}
					}
				}
				
			}
			else
			{
				nums += full.charAt(count);
			}

		}
		if(nums!="" )
		{
			numbersList.add(Integer.parseInt(nums));
		}
		
		if(operatorList.size()>=1 & numbersList.size()>=2)
		{
			int total = 0;
			boolean error = false;
			for(int numIndex = 0 ; numIndex < operatorList.size();numIndex++)	
			{
				try
				{
					if(numIndex!=operatorList.size()-1 | operatorList.size()==1)
					{
						total+=Integer.parseInt(calculate(operatorList.get(numIndex),numbersList.get(numIndex),numbersList.get(numIndex+1)));
					}
					else
					{
						total=Integer.parseInt(calculate(operatorList.get(numIndex),numbersList.get(numIndex+1),total));
					}
				}
				catch(ArithmeticException e)
				{
					System.out.println("error");
					error=true;
				}
			}
			displayLocation.setText(""+total); 
			if(error)
			{
				emptyCalculator();
			}		
		}
		else
		{
			System.out.println("error");
			emptyCalculator();
		}
	}
	
	private String calculate(char operator,int num1,int num2)
	{
		System.out.println("char is " + operator  + " number 1 is " + num1 + " number 2 is " + num2);
		switch(operator)
		{
			case '+': 
				return additive(num1,num2);
			case '-':
				return sub(num1,num2);
			case 'X': 
				return multiply(num1,num2);
			case '/':
				return div(num1,num2);
				
		}
		return "";
		
	}
	
	private String additive(int num1,int num2)
	{
		return "" + (num1+num2);
	}
	public String sub(int num1,int num2)
	{
		return "" + (num1-num2);
	}
	public String div(int num1,int num2)
	{
		return ""+ (num1/num2);
	}
	public String multiply(int num1,int num2)
	{
		return "" +num1*num2;
	}
	
	

	
	
}
