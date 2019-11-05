package chennai;

public class RemoveSpecialChar {
	
	
	public static void main(String args[]) {
		
		String str="rahul 15545 @#$%^&*";
		str=str.replaceAll("[^a-zA-Z0-9]", "2");
		System.out.println(str);
		
		
		
	}

}
