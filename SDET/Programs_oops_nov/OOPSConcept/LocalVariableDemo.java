package OOPSConcept;

public class LocalVariableDemo {
	int y;
	public static void main(String[] args) {
		int y=100;
		System.out.println(y);//100
		 y=900;
		 
		 System.out.println(y);//900
		 LocalVariableDemo obj = new LocalVariableDemo();
		 System.out.println(obj.y);//0
		 
		 
	}
	
	 

}
