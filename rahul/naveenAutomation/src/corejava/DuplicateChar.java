package corejava;

public class DuplicateChar {

	public static void main (String args[]) {
		
		String str ="java";
		
		for(int i=0;i<str.length();i++) {
			for(int j= 1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j)) {
					
					break;
				}
				else {
					System.out.print(str.charAt(i));
				}
			}
		}
	}
}
