package Static;

class A{
	static int i;
	static void test() {
		
	}
}

public class StaticExample {

	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(A.i);
		A.test();

	}

}
