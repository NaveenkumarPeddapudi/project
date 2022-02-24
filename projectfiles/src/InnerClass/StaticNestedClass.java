package InnerClass;


class OuterClass2{
	
	private static String msg ="NAVEEN_KUMAR";
	
	static class InnerClass2{
		void msg() {
			System.out.println(msg);
		}
	}
}

public class StaticNestedClass {

	public static void main(String[] args) {
		OuterClass2.InnerClass2 inner = new OuterClass2.InnerClass2();
		
		inner.msg();
		

	}

}
