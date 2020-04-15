package pkg2;

public class Student2 {
	
	
	public Student2 (){
		this (1,2,3);
		System.out.println("This is Default Constructor");
	}

	public Student2 (int a)
	{
		this (1,2);
		System.out.println("This is 1 parametrized Constructor");
	}
	
	public Student2 (int a , int b)
	{
		this ();
		System.out.println("This is 2 parametrized Constructor");
	}
	public Student2 (int a , int b, int c)
	{
		
		System.out.println("This is 3 parametrized Constructor");
	}
	
	public static void main(String[] args) {
		new Student2(1);
		System.out.println("Hi");
		
		
	}
}
