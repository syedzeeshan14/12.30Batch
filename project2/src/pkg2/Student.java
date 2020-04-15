package pkg2;

public class Student {

	int age;
	int roll_num;
	
	public void Display1 ()
	{
		System.out.println("Welcome All of you");
	}
	
	public void Display2 () {
		System.out.println("Welcome Guys");
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.age= 29;
		System.out.println(obj.age);
		obj.roll_num = 10018;
		System.out.println(obj.roll_num);
		obj.Display1();
		obj.Display2();
	}
}
