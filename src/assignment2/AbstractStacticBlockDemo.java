package assignment2;

public class AbstractStacticBlockDemo {

	static {
		System.out.println("Inside the STATIC block of Driver Class");
	}
	{
		System.out.println("Inside the INSTANCE block of Driver Class");
	}

	/*
	 * When Class is loaded then itself Static block is loaded and executed.
	 * Here comes the execution hierarchy. First, Static Block inside the
	 * DRIVER class is executed. Then Static Block inside the PARENT ABSTRACT CLASS and 
	 * then the class which inherited the Parent abstract class. 
	 * 
	 * After Static Block Execution when we create an instance or object to the Child class 
	 * which inherited the Parent abstract class, then INSTANCE Block, followed by 
	 * CONSTRUCTOR inside the PARENT ABSTRACT class is executed. 
	 * Then INSTANCE Block, followed by CONSTRUCTOR inside the Child 
	 * Class(which inherited the Parent abstract class) is executed. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Normal n = new Normal();
		
		System.out.println("\n Discussion about /'instance of abstaract class/' ");
		Abstract_StacticBlockDemo abs = new Abstract_StacticBlockDemo() {
		};
		Abstract_StacticBlockDemo abs1 = new Abstract_StacticBlockDemo() {
		};
		System.out.print("\nLet's compare both the reference variables /'abs == abs1/' : " );
		System.out.println(abs == abs1);
		System.out.println("\n /'abs/' is the instance of ANNONYM1OUS CLASS named:"
				+ " "+abs.getClass().toString()+" Observe the /'$/' symbol.\n So this is not Original Class. \n This is an annonymous class created for driver class. Hence /'abs/' is not instance of abstract class.\n By this we can understand 'Cannot Instantiate Abstract Class.' ");
		
		System.out.println("\n /'abs1/' is the instance of ANNONYM1OUS CLASS named:"
				+ " "+abs1.getClass().toString()+" Observe the /'$/' symbol."
						+ "\n So this is not Original Class. "
						+ "\n This is an annonymous class created for driver class. "
						+ "Hence /'abs1/' is not instance of abstract class.\n By this we can understand 'Cannot Instantiate Abstract Class.' ");
System.out.println("\n OBSERVE THE NAMES : \nclass assignment2.AbstractStacticBlockDemo$2 AND \nclass assignment2.AbstractStacticBlockDemo$. \nDiffer by $1 and $2.. here 1,2 are annonymous class number.");
	}

}

class Normal extends Abstract_StacticBlockDemo {
	int a;

	public Normal() {
		// TODO Auto-generated constructor stub

		System.out.println("Inside CHILD(which extends Abstract class) Constructor");
		this.a = 10;
	}
 
	
	static {
		System.out.println("Inside CHILD(which extends Abstract class) Static Block");
	}
	{
		System.out.println("Inside CHILD(which extends Abstract class) Instance Block");
	}

	public int getAa() {
		return a;
	}

}

abstract class Abstract_StacticBlockDemo {

	int a;

	public Abstract_StacticBlockDemo() {
		System.out.println("Inside PARENT(abstract class) Constructor");
		this.a = 10;
	}

	static {
		System.out.println("Inside PARENT(abstract class) Static Block");
	}
	{
		System.out.println("Inside PARENT(abstract class) Instance Block");
	}

	public int getAa() {
		return a;
	}
}
