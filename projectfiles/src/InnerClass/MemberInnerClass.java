package InnerClass;

class OuterClass{
	private String msg ="NAVEEN_KUMAR";
	
	class InnerClass{
		void hello() {
			System.out.println(msg);
		}
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.hello();
	}

}
