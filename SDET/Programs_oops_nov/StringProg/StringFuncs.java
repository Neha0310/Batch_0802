package StringProg;

public class StringFuncs {

	public static void main(String[] args) {
		String str = "Test user";//CP
		String str1 = "Test User";//CP
		
		String str3 = new String("Test user");//Heap--m/m allocation 
		
		
		if(str.equalsIgnoreCase(str1)) {
			System.out.println("Matched");
		}else {
			System.out.println("Not matched");
		}
		
		String strMsg = "Selenium is an open source tool";
		strMsg = strMsg.concat(str1);
		System.out.println(strMsg);
		
		boolean res = strMsg.contains("Selenium");
		System.out.println(res);
		
		
		
		
	}

}
