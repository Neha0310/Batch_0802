package StringProg;

public class ReplaceCharWithStar {
	static char ch ;
	public static void main(String[] args) {
		String str = "testing";
		String newStr="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='t') {
				 ch='*';
				newStr+=ch;//newStr = newStr+ch
			}else {
				newStr+=str.charAt(i);
			}
		}
		
		System.out.println(newStr);

	}

}
