package interview;

public class RevString {
	public static void main(String args[]) {
		
		String s = "rahul";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		StringBuffer s1= new StringBuffer(s);
		System.out.println(s1.reverse());
	}
	
	

}
