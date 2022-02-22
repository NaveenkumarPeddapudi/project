package typecasting1;

public class typecasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit type casting
		
		byte a = 9;
		System.out.println(a);
		short b = a;
		System.out.println(b);
		int c = b;
		System.out.println(c);
		long d = c;
		System.out.println(d);
	
		
//explicit type casting
		
		long s =7;
		System.out.println(s);
		int t= (int)s;
		System.out.println(t);
		short u = (short)t;
		System.out.println(u);
		byte v = (byte)u;
		System.out.println(v);
		

		
		char m = 'A';
		System.out.println(m);
		
		
		int n =m;
		System.out.println(n);
		
		float o = n;
		System.out.println(o);
		
		double p = m;
		System.out.println(p);
		
		float g = (float)p;
		System.out.println(g);
		
		int h = (int)p;
		System.out.println(h);
		
		char i = (char)h;
		System.out.println(i);


	}

}
