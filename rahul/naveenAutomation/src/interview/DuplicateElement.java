package interview;

public class DuplicateElement {
	public static void main (String args[]) {
		
		String name[]= {"java", "javaScript","rahul","java","rahul"};
		for(int i=0;i<name.length;i++) {
			for(int j= i+1;j<name.length;j++) {
				if(name[i].equals(name[j])) {
					System.out.println(name[i]);
				}
			}
		}
		
		//hashset:java collection : it store unique value
		
		
		
		
	}


}
