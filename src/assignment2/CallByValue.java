package assignment2;

public class CallByValue {
	
	String s = "Siva";
	int a = 9;
	
	 void add(String s){
		s = s + "Ram";
		System.out.println("inside add:"+s);
	}
	 void mul(CallByValue cal){
		 cal.a = cal.a * 9;
		 System.out.println("inside mul:"+a);
	 }
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValue call = new CallByValue();
		System.out.println("**CALL BY VALUE**");
		System.out.println("Doesn't Modified : "+call.s);
		call.add("Ram");  // call by value
		System.out.println("Modified : "+call.s);
		
		System.out.println("\n**CALL BY REFERENCE**");
		System.out.println("Doesn't Modified : "+call.a);
		call.mul(call);		// call by reference
		System.out.println("Modified : "+call.a);
		

	}

}
