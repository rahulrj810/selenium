package corejava;

import java.util.Scanner;

public class Hacker {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        int i = scan.nextInt();
	        double d= scan.nextDouble();
	        
	        //char c = scan.next().charAt(0); 
	        String name= scan.nextLine();
	        
	        
	       //scan.nextLine();
	        
	        //String sc= scan.nextLine();

	        // Write your code here.
	        System.out.println("String: " +name);
	        System.out.println("Double: " +d);
	        System.out.println("Int: " +i);
	       
	    }
}
