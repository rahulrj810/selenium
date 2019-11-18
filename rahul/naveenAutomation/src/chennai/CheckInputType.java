package chennai;

import java.util.Scanner;

public class CheckInputType {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);
		
		if((ch>='A'&& ch<='Z') || (ch>='a' && ch<='z')) {
			
			System.out.println("it is alphabet");
		}
		else if((ch>='0' && ch<='9')){
			System.out.println("character is digit");
			
		}
		
	}

}
