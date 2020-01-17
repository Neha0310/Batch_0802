package OOPSConcept;

public class StaticVariablrDemo {
	static int a;//static M/m
	
	public static void main(String[] args) {
		
		StaticVariablrDemo obj =new StaticVariablrDemo();
		System.out.println(obj.a=100);
		StaticVariablrDemo obj1 =new StaticVariablrDemo();
//		System.out.println(StaticVariablrDemo.a);
		System.out.println(obj1.a);
	}
	

}
