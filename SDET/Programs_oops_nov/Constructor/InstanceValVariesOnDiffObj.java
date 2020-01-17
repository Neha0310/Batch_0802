package Constructor;

public class InstanceValVariesOnDiffObj {
	static int x=1;
	 
	public InstanceValVariesOnDiffObj() {
		 
		 x++;
		 System.out.println(x);
		
	}
	 
	public static void main(String[] args) {
		InstanceValVariesOnDiffObj a= new InstanceValVariesOnDiffObj();
		InstanceValVariesOnDiffObj b= new InstanceValVariesOnDiffObj();
		InstanceValVariesOnDiffObj c= new InstanceValVariesOnDiffObj();
		InstanceValVariesOnDiffObj d= new InstanceValVariesOnDiffObj();
		InstanceValVariesOnDiffObj e= new InstanceValVariesOnDiffObj();
		 
		 
	}

}
