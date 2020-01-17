package ArraysPrograms;

public class patternTest {

	public static void main(String[] args) {
		int n=4;int i=0;
		for(i=1;i<=n;i++) {
			for(int sp=1;sp<=n-i;sp++){
				System.out.print(" ");
			}
			for(int st=1;st<=(2*i)-1;st++) {
				System.out.print((2*i)-1);
				
			}
			System.out.println();
				
		}

	}

}
