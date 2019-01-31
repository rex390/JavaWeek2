package SpareTimeSwing;

import javax.swing.JFrame;

public abstract class GUI extends JFrame
{
	GUI(String windowName,int width,int height)
	{
		setTitle(windowName);
		windowBuild();
		windowLayout();
		setSize(width,height);
		setVisible(true);	
	}
	
	
	protected abstract void windowBuild();
	protected abstract void windowLayout();
}
