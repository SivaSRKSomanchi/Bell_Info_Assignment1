package assignment2;

public class klljsflk extends Siva {

	int a = 9, c = 76;
	String b = "jhjdkhsdak";

	public klljsflk() {
		System.out.println("Iniside Child Constructor");
	}

	static {
		System.out.println("Iniside Child Static");
	}

	{
		System.out.println("Iniside Child Instance");
	}

	public int getC() {
		return c;
	}

	public String getS() {
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Siva s = new Siva();
		klljsflk k = new klljsflk();
		System.out.println(k.getC());
		System.out.println(k.getS());
		// System.out.println(a);
	}

}

class Siva {

	int c = 9;
	String d = "hfhfh";

	// static int a = 0;

	public int getC() {
		return c;
	}

	public Siva() {
		super();
		System.out.println("Iniside Parent Constructor");
	}

	// System.out.println(a);

	static {
		// a = 9;
		System.out.println("Iniside Parent Static");
	}

	{
		System.out.println("Iniside Parent Instance");
	}

}
