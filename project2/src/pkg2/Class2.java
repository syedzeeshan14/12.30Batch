package pkg2;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args)  {
        String s = "My Name is Syed";
        String s1 = "";
        for(int i = s.length()-1; i >= 0; i--)
        {
        	s1 = s1 + s.charAt(i);
        }
        
        System.out.println("Reversed string is: " +s1);
        
	}
}
		


