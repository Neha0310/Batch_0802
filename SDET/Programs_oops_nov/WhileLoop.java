
public class WhileLoop {
	public static void main(String[] args) {
		int n=123;//45//4
		
		int temp=n;
		int rem;//6
		int rev=0;//6//65
		while(n>0) {
			rem = n %10; 
			n =n/10;//4//0
			rev=rev*10 + rem; 
		 }
		
		if(temp==rev) {
			System.out.println("its palindrom");
		}else {
			System.out.println("not a palindrom");
		}
		  
			
		 
		 
		 
		
		 

	}

}
