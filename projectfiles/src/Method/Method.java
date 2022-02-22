package Method;

class A{
	int i;
	int  test(int i) {
		this.i =++i;
		return ++i;
	}
}

public class Method {

	public static void main(String[] args) {
		A a=new A();
		int i =a.test(5);
		
		System.out.println(a.i);
		System.out.println(i);

	
		

	}

}
