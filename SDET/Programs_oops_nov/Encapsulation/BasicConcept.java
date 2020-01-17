package Encapsulation;

public class BasicConcept {
//	private String name;
//	private String  acc_no;
//	private String password;
	
	private int a;//0-->100
	private int b;//0-->300
	public int sum;
	
	public  void set_aVal(int x) {
		 a=x;
	}
	public  void set_bVal(int y) {
		 b=y;
	}
	public  int get_aVal() {
		 return a;
	}
	
	public  int get_bVal() {
		 return b;
	}
	
	
	public int sum() {
		 
		int p = a;
		int q = b;
		sum = p+q;
		return sum;
	}
	
	
	
	
	
	
	
//	public  void set_name(String name) {
//		System.out.println("Enetr in setName method");
//		this.name=name;
//	}
//	
//	public String get_name() {
//		return name;
//	}
//	
//	public  void set_acc_no(String acc_no) { 
//		this.acc_no=acc_no;
//	}
//	
//	public String get_acc_no() {
//		return acc_no;
//	}
	

	

}
