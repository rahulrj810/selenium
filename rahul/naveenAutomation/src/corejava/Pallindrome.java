package corejava;

public class Pallindrome {
	public static void main(String args[]) {
		
		
		
		int i=123;
		int temp=i;
		int rev,sum = 0;
		
		while(i>0) {
		 
		 rev=i%10;
		 sum=(sum*10)+rev;
		 
		i= i/10;
		}
		System.out.print(sum);
		}
		
	
		
	

}
