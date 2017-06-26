package assignment2;

public class InheritanceScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P pp = new C();
		
		/*according to output.. 
		 * Parent Reference variable can access all overridden methods and 
		 * if any method (just like add()) doesn't override by child class then also we can
		 * access the original method from Parent Class.  */
		System.out.println(pp.a);
		System.out.println(pp.f);
		System.out.println(pp.b);
		System.out.println(pp.add());
		System.out.println(pp.here());
		
		/*Below comments are: there() and mod() are Specific methods of CHild class C.
		 * 						which are not accessible with Parent reference variable.*/
		
//		System.out.println(pp.there());
//		System.out.println(pp.mod());
		
	}

}

class P {
	int a=4, f=7;
	String b="ParentS";

	
	public int add() {
		System.out.println(" add Method in Parent class");
		return a + f;
	}

	public String here() {
		return "String Inside Parent Class";
	}

}

class C extends P {
	int c=6, k=2;
	String d="ChildS";

	
	public C() {
		super();
		a=5;
		f=8;
		b = "OverriddenParentS	";
		// TODO Auto-generated constructor stub
	}

	// public int add(){
	// System.out.println("Overridden add Method in Child class");
	// return a*f;
	//
	// }
	public String here() {
		return "Overridden String Inside Child Class";
	}

	public int mod() {
		System.out.println("Specific mod Method of Child class");
		return c % k;
	}

	public String there() {
		return "Specific String method inside Child Class";
	}

}
