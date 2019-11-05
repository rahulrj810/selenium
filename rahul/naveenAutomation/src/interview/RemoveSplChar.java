package interview;

public class RemoveSplChar {
	public static void main(String args[]) {
		String s ="!@#$%^&*&^%$#@  rahul 3273297  raDS";
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
