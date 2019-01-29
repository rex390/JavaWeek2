package AbstractClass;

public class Main {

	public static void main(String[] args) 
	{
		ClassOne ref = new ClassTwo();
		//ClassTwo two = ref;
		tester((ClassTwo)ref);
		interfaceTester((InterfaceTester)ref);

	}
	
	public static void tester(ClassTwo testing)
	{
		testing.go();
	}
	
	public static void interfaceTester(InterfaceTester testing)
	{
		testing.messagetwo();;
	}

}
