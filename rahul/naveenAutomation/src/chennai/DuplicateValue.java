package chennai;

import java.util.Scanner;

public class DuplicateValue {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the name");
		
		String name= sc.nextLine();
		char[]str= name.toCharArray();
		
		for(int i=0;i<name.length();i++) {
			//int count=0;
			
			for(int j=1;j<name.length();j++) {
				if(str[i]==str[j]) {
					System.out.println(str[i]);	
					
					//count++;
				}
				
				
			}
			//if(count == 0) {
				
			}
			
			
		}
		
		
		
	}


