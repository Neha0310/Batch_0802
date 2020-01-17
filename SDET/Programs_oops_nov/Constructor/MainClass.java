package Constructor;

public class MainClass {
	int x=700;
	public static void main(String[] args) {
		ConstBasics obj = new ConstBasics(1);//Default Const	
		 //200, Parameteric Const 
		System.out.println("value of x in main-"+ obj.x);//900
		//System.out.println("value of x in main-"+ obj1.x);//0
		obj.ConstBasics();
		MainClass mc = new MainClass();
		System.out.println(mc.x);
		
	}

}
