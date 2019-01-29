package ResultsWeek2Day1;

public class Results 
{
	private int phy,che,math,failedAmount;
	
	
	public void  markWork(int passingMark)
	{
		failedCheck(che,passingMark);
		failedCheck(phy,passingMark);
		failedCheck(math,passingMark);
		printMessage();
	}
	private void printMessage()
	{
		switch(failedAmount)
		{
			case 0: showResults();
			break;
			case 1:  System.out.println("Retake the exam");
			break;
			case 2:  System.out.println("Repeat the course");
			break;
			case 3: System.out.println("Go Home");
			break;
		}
	}
	public void failedCheck(int mark,int passingMark)
	{
		if(mark<passingMark)
		{
			failedAmount++;
		}
	}
	
	private void showResults()
	{
		int total,per;
		total = phy + che+ math;
		per = total * 100/450;
		System.out.println("Total marks " + total);
		System.out.println("Percentage " + per + "%");
	}
	public int getPhy() 
	{
		return phy;
	}

	public void setPhy(int phyPassed) 
	{
		phy = phyPassed;
	}

	public int getChe() 
	{
		return che;
	}

	public void setChe(int chePassed) 
	{
		che = chePassed;
	}	
	public void setMath(int mathPassed)
	{
		math = mathPassed;
	}
}
