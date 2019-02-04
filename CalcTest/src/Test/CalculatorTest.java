package Test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import Logic.Calculator;

public class CalculatorTest 
{
	Calculator calc ;
	
	@Before
	public void Setup()
	{
		calc = new Calculator();
	}
	
	@Test
	public void calcTest1()
	{
		assertEquals(2, calc.addition(2,0));
	}
	
	@Test
	public void calcTest2()
	{
		assertEquals(2, calc.addition(2,0));
	}
	
	@Test
	public void calcTest3()
	{
		assertEquals(4, calc.addition(2,2));
	}
	
	
	@Test
	public void calcTestSub1()
	{
		assertEquals(1, calc.subtraction(2,1));
	}
	
	@Test
	public void calcTestSub2()
	{
		assertEquals(0, calc.subtraction(2,2));
	}
	
	@Test
	public void calcTestSub3()
	{
		assertEquals(-2, calc.subtraction(2,4));
	}
}
