package chennai;

public class DuplicateValue {
	
	public static void main(String args[]) {
		
		String s="selenium";
		String sb=" ";
		for(int i=s.length()-1;i>=0;i--) {
			String st=s.substring(i, i+1);
			
			if(sb.indexOf(st)==-1) {
				
				sb.concat(st);
				System.out.println(sb);
				
			}
		}
		System.out.println(sb);
	}
		
		
	}


