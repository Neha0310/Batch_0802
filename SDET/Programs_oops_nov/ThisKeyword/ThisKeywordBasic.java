package ThisKeyword;

public class ThisKeywordBasic {

	public  void m1() {
		System.out.println(this); 
	}
	
	public  void m2() {
		m1();
		System.out.println(this); 
	}
	public static void main(String[] args) {
		ThisKeywordBasic obj = new ThisKeywordBasic();
		//System.out.println(obj);//ThisKeyword.ThisKeywordBasic@52e922
		obj.m1();
		System.out.println("==============");
		ThisKeywordBasic obj1 = new ThisKeywordBasic();
		//System.out.println(obj1);
		obj1.m2();
		 
		
		
	}

}
