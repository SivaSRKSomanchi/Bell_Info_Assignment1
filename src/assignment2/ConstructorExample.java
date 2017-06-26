package assignment2;

public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Overload{
	int a;
	int b;
	
	/*HERE, no RETURN type BUT same method NAME with DIFFERENT PARAMETERS.
	 * SO OVERLOADING A CONSTRUCTOR IS POSSIBLE  */
	
	public Overload(int a){
		
	}
	public Overload(){
		
	}
	public Overload(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	/*BUT OVERIDDING A CONSTRUCTOR IS NOT POSSIBLE. 
	 * REASON: OVERIDDING is possible only when we inherit. But we never 
	 * inherit a constructor.*/
	
	
}
