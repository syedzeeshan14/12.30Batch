package pkg2;

public class Assignment {

	public static void main(String[] args) {
		String s = "syed";
		int l= s.length();
		int t= l-1;
		 for (int i=0; i<t; ++i){
			 if (s.charAt(i)==s.charAt(t)){
				 System.out.println("It is a Palindrome");
			 }
			 else {
				 System.out.println("Not a palindrome");
			 }
			 break;
		 }
		
		
		
		

	}

}
