package OOPSConcept;

public class InstanceVariablesDemo {
	
	
	double x=100;// property of class
	
	public static void main(String[] args) {
		
		
		
		InstanceVariablesDemo obj = new InstanceVariablesDemo();
		//System.out.println(obj);//classname@
		System.out.println("Access x with obj1--"+obj.x);//
		
		InstanceVariablesDemo obj1 = new InstanceVariablesDemo();
		System.out.println("Access x with obj2--"+obj1.x);
		
	
		System.out.println("After  chnages-----");
		System.out.println("Access x with obj1--"+obj.x);//
		System.out.println("Access x with obj2--"+obj1.x);
		
		
		

	}

}
