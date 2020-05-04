package pkg2;

public class Assignment2 {
	
	public int sum (int a, int b) {
		int c;
		c= a+b;
		System.out.println("Print the value of sum: " +c);
		return c;
	}
	public int sub (int a , int b) {
		int c;
		c= a-b;
		System.out.println("Print the value of sub: " +c);
		return c;
	}
	public int mul (int a, int b) {
		int c;
		c= a*b;
		System.out.println("Print the value of Multiplication: " +c);
		return c;
		
	}
	
	public void div (int a, int b) {
		int c;
		c= a/b;
		System.out.println("Result of Expression (((10+2)-2)*2)/2: " +c);
		
	}
	public static void main(String[] args) {
		Assignment2 obj = new Assignment2();
		int sum_result=obj.sum(10, 2);
		int sub_result=obj.sub(sum_result, 2);
		int mul_result = obj.mul(sub_result, 2);
		obj.div(mul_result, 2);
	}
		
	}


