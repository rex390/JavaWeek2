
public class DatabaseFormat 
{
	int reg;
	String name="";
	int mark;	
	public DatabaseFormat(int reg, String name, int mark) 
	{
		super();
		this.reg = reg;
		this.name = name;
		this.mark = mark;
	}
	public int getReg() 
	{
		return reg;
	}
	public void setReg(int reg) 
	{
		this.reg = reg;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) 
	{
		this.mark = mark;
	}
}
