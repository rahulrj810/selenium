package chennai;

public class Palindrome {
	
	public static void main(String args[]) {
		
		int a= 121;
		int temp=a;
		int rev=0;
		while(a!=0) {
			
			rev=rev*10+(a%10);
			a=a/10;
			
			
		}
		if(temp==rev) {
			
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palimdrome");
		}
		
		
		
	}
	

}
