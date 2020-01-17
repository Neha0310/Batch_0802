package ThisKeyword;

public class ThisWithConst {

	public ThisWithConst(){
		m1();
		System.out.println("Default const.");//2
	}
	public ThisWithConst(int a){
		 this();
		 
		System.out.println("parameteric  const.");	//3
	}
	
	public ThisWithConst(int a, String txt){
		 this(a);
		 
		System.out.println("two parameteric  const."+ a+"=="+txt);//4	
	}
	
	public void m1() {
		 System.out.println("m1");//1
	}
	public static void main(String[] args) {
		ThisWithConst obj = new ThisWithConst(100,"test");

	}

}
