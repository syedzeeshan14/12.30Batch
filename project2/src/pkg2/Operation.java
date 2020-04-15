package pkg2;

public class Operation {

	public int sum (int a , int b)
	{
		int c;    
		c= a+b;    // storing the result
		System.out.println("Sum of the Result : " +c);
		return c;   //
	}
	
	public int  sub (int x, int y)
	{
		int z;
		z= x-y;
		System.out.println("Result of Sub : " +z);
	return z;
	}
	
	public int add2(int q, int w)
	{
		int t;
		t = q+w;
		System.out.println("Sum of Expression: " +t);
		return t;
	}
	public int mul (int q, int w)
	{
		int e;
		e= q*w;
		System.out.println("Result of Multiplication : " +e);
		return e;
		
	}
	
	public void div(int a, int b) {
		int g;
		g= a/b;
		System.out.println("Result of Expression: " +g);
		
	}
	public static void main(String[] args) {
		Operation obj = new Operation ();
		int sum_result = obj.sum(10, 2);
		int sub_result= obj.sub(sum_result,2);
		int sum_resul = obj.add2(sub_result, 2);
		int mul_result = obj.mul(sum_resul, 2);
		obj.div(mul_result,2);
		
	}
}
