package assignment2;

public class BlocksExecutionSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex e = new Ex();
	}

}

class Ex {
	static {
		System.out.println("Inside Static Block");
	}
	{
		System.out.println("Inside Instance Block");
	}
	public Ex(){
		System.out.println("Inside Constructor");
	}

}
