package InnerClass;

abstract class A{
	public abstract void hello();
	
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		A a = new A() {
			public void hello () {
				System.out.println("inside anonymous inner class");
			}
		};
		a.hello();
		

	}

}
