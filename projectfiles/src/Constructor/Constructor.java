package Constructor;

class A{
	int i; 
	int j;
	
	/*A(){
	 * i=5;
	 * i=6;
	 */
	A(int i,int j){
		this.i = 5;
		this.j = 6;
		
		
	}
	
}


public class Constructor {

	public static void main(String[] args) {
		/*
		 * A a = new A();
		 */
		A a = new A(1,2);
		System.out.println(a.i);
		System.out.println(a.j);

	
		

	}

}
