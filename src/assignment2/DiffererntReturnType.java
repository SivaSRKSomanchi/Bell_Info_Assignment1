package assignment2;

public class DiffererntReturnType implements interface11, interface22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * As the return type in both the interfaces are different, while
	 * implemeting we are getting a compilation error. Same name and different
	 * return types put Compiler in confusion. Compiler doesn't know to implement, which 
	 * method from which interface.
	 * 
	 * HENCE WE CAN'T OVERRIDE A METHOD WITH SAME NAME AND DIFFERENT RETURN TYPES.
	 */
	@Override
	public String barks() {
		// TODO Auto-generated method stub
		return "inside barks, interface2";
	}

	// public int barks(){
	// return 1;
	// }

}

interface interface11 {

	/*
	 * Stub for method barks in interface1 here the return type is "int"
	 */
	public int barks();
}

interface interface22 {

	/*
	 * Stub for method barks in interface2 here the reference type is String
	 */
	public String barks();
}
