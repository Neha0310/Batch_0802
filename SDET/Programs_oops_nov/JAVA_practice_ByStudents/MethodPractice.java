package JAVA_practice_ByStudents;

public class MethodPractice {
	int x;
	static int y;
	public static void m1( MethodPractice obj) {
		System.out.println("in m1 "+y);
		System.out.println(obj.x);
	}
	public void m2() {
		System.out.println("in m2 instance "+x);
		System.out.println("in m2 static "+y);
		
	}
	public static void main(String[] args) {
		MethodPractice obj = new MethodPractice();
		m1(obj);
		obj.m2();
	}

}
