package java_abstraction.inheritance;

public class Abstraction {

	public static void main(String[] args) {
		
		Number n;
		n = max((byte)10, (byte)20);
		System.out.println(n);
		
		n = max((short)10, (short)20);
		System.out.println(n);
		
		n = max(10, 20); // int is default
		System.out.println(n);
		
		n = max((long)10, (long)20);
		System.out.println(n);
		
		n = max((float)10, (float)20);
		System.out.println(n);
		
		n = max(10.0, 20.0); // double is default
		System.out.println(n);
	}

	static Number max(Number n1, Number n2) {
		Double d1 = n1.doubleValue();
		Double d2 = n2.doubleValue();
		
		if (d1 > d2 ) {
			return d1;
		}else {
			return d2;
		}
	}
}
