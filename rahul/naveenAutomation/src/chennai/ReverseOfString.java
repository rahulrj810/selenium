package chennai;

public class ReverseOfString {
	
	public static void main(String args[]) {
		
		
		String sc="selenium";
		String rev="";
		for(int i=sc.length()-1;i>=0;i--) {
			
			rev=rev+sc.charAt(i);
			
		}
		System.out.println(rev);
		
		String str= "java";
		
		StringBuffer st= new StringBuffer(str);
		System.out.println(st.reverse());
		
		int a=123;
		System.out.println(new StringBuffer(String.valueOf(a)).reverse());
		
	}

}
