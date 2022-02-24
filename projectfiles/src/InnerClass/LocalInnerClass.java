package InnerClass;

class OuterClass1{
	private String msg = "NAVEEN_KUMAR";
	
	void disaply() {
		
		class InnerClass1{
			void msg() {
				System.out.println(msg);
			}
		}
		InnerClass1 innerObj = new InnerClass1();
		innerObj.msg();
		
	}
	
}

public class LocalInnerClass {

	public static void main(String[] args) {
		OuterClass1 outer = new OuterClass1();
		outer.disaply();
		
		

	}

}
