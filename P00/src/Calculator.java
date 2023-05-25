
public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	
	public int subtract(int a,int b) {
		return a- b;
	}
	
	public int multiply(int a,int b) {
		return a*b;
	}

	public int divide(int a,int b) {
		if(b == 0) {
			System.out.println("Error: Number should not be 0");
			return a/b;
		}else if(b > a) {
			System.out.println("Error: Divisor(" + b+")is bigger than divedend("+ a + ")");
			return a/b;
		}
		return a/b;
		
		
	}
}
