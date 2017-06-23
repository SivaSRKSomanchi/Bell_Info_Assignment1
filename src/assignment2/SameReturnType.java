package assignment2;

/**
 * @author Sivaram Somanchi
 *
 */
public class SameReturnType implements interface2, interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Creating Example Class object. ex- Example reference type */
		SameReturnType ex = new SameReturnType();
		/* Calling overriden barks method using ex*/
		System.out.println("With Example Object: " + ex.barks());
		
		/* Creating Example Class object. int1- interface1 reference type */
		interface1 int1 = new SameReturnType();
		/* Calling overriden barks method using int1*/
		System.out.println("With Interface1 Reference : " + int1.barks());

		/* Creating Example Class object. int2- interface2 reference type */
		interface2 int2 = new SameReturnType();
		/* Calling overriden barks method using int2*/
		System.out.println("With Interface2 Reference : " + int2.barks());
		
		
		/*Whatever the Reference type we used to call
		 *Output remains same */
 
	}

	
	/* There is no compilation error as the method "barks" has same name, signature and 
	 * return  type.
	 * Once we write the concrete definition of the common method in both interfaces then 
	 * no problem for the compiler to execute as they are same in every aspect.  */
	
	
	
	@Override
	public String barks() {
		// TODO Auto-generated method stub
		return "Barks";
	}

}

interface interface1 {
	
	//Stub for method barks in interface1
	public String barks();
}

interface interface2 {
	
	//Stub for method barks in interface2
	public String barks();
}