package ThisKeyword;

public class ThisWithVariables {
	 int x;
	public  void m1(int x) {
		this.x=x;
		System.out.println(x);
	}
	
	public  ThisWithVariables(int x) {
		this.x=x;
		System.out.println(x);
	}
	
	
	
	public static void main(String[] args) {
		ThisWithVariables obj =new ThisWithVariables(200);
		System.out.println(obj.x);// 0
		obj.m1(100);//100
		//System.out.println(x);//0

	}

}
