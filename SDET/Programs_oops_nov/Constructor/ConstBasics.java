package Constructor;

public class ConstBasics {
	static int x;//0->900
	static int y;
	public  ConstBasics() {
		System.out.println("Default Const");
	}
	
	public  ConstBasics(int x) {
		 
		System.out.println("value of x inside const"+ x);
		System.out.println("Parameteric Const");
	}
	
	public  ConstBasics(double x,int y) {
		 
		System.out.println("value of x inside const"+ x);
		System.out.println("Parameteric Const");
	}

	public void ConstBasics() {
		System.out.println("Hello");
	}
	
	

}
