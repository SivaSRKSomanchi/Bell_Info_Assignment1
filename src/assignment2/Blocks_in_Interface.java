package assignment2;

public class Blocks_in_Interface implements innerClassStaticBlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticInsideInnerClassDemo s = new StaticInsideInnerClassDemo();
		
		System.out.println(a);
	}

}

interface staticTest {

	/*
	 * "STATIC BLOCK"   :   static{ System.out.println("Siva"); }
	 * "INSTANCE BLOCK" :   { System.out.println("S"); }
	 * 
	 * REASON 1: WE CANNOT DEFINE AN INITIALIZER IN INTERFACE. STATIC BLOCK EXECUTES
	 *           FIRST. IT IS ON TOP OF ANY METHOD OR BLOCK. 
	 *           Static block is Executed when JVM loads the class.. 
	 *           STATIC BLOCK IS FOLLOWED BY INSTANCE BLOCK IN EXECUTION HEIRARCHY.
	 *           
	 * REASON 2: STATIC METHODS ARE NOT ABLE TO OVERRIDE. SO WHAT IS THE USE OF HAVING STAIC
	 * 			 BLOCKS INNSIDE AN ITERFACE?? as INTERFACE FEATURE IS USED IN JAVA FOR 
	 * 			 METHOD OVERRIDING.
	 * 
	 * REASON 3: Generally, STATIC BLOCKS ARE USED TO INITIALIZE THE VARIABLES. AS WE 
	 * 		  	 USUALLY DECLARE and INITIALIZE THE VARIABLES IN INTERFACE AS "static final",
	 * 			 so there is no use of static blocks inside the interface.
	 * 				a) public static final int x = 9;
	 * 				b) public int x;
	 * 					static{
	 * 					x=9; 
	 * 					}
	 * 			 BOTH a) and b) are same, I guess. "b)" is not preferred by compiler.
	 * 
	 * REASON 4: THE INTERFACE ITSELF MEANS NO IMPLEMENTATION FOR METHODS. BUT BLOCK itself
	 * 			 means, must have implementation. So there is no use of having 
	 * 			 STATIC/INSTANCE BLOCK IN INTERFACE. 
	 * 			 There are three places in java where you can perform operations: 
	 * 			 1. method 
	 * 			 2. constructor
	 *           3. block
	 */
}


// In this case only WE CAN USE STAIC block INSIDE INNER CLASS of the INTERFACE.

interface innerClassStaticBlockTest{
	
	public static final int a = StaticInsideInnerClassDemo.getNum();
	
	class StaticInsideInnerClassDemo{
		
		
		
		public StaticInsideInnerClassDemo(){
			System.out.println("Constructor invoked inside Inner Class of Interface.");
		}
		static {
			System.out.println("Static Block inside Inner Class of Interface.");
		}
		
		{
			System.out.println("Instance Block inside Inner Class of Interface.");
		}
		
		
		
		
		static int getNum(){
			return 3;
		}
	}
}