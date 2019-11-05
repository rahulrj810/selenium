package corejava;

public class Reverse {
	public static void main(String args[]) {
		 
		String str="rahul";
		String rev="";
		
		int temp=str.length();
		
		for(int i=temp-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);			
			
		}
		System.out.println(rev);
		
		
	}

}
