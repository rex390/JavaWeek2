package Swing;

public class Mains {

	public static void main(String[] args) 
	{
		SwingTest swingTest = new SwingTest();
		swingTest.runTest(600,600,"swingTester");
		//swingTest.createButton("click here", 0, 0, 600, 600);
		swingTest.createButton("click here", swingTest.getFrame().getWidth()/2-50, swingTest.getFrame().getHeight()/2-50, 100, 100);
		swingTest.addTextField("text field",swingTest.getFrame().getWidth()/2-50, swingTest.getFrame().getHeight()/2-50, 300, 300);
		//swingTest.createButton("click here", 0, 300, 300, 300);
		
	}

}
