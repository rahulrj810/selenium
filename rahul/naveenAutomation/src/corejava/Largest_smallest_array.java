package corejava;

public class Largest_smallest_array {
	public static void main(String args[]) {
		
		int num[]= {10,20,50,80,635};
		
		int largest=num[0];
		int smallest=num[0];
		
		for(int i=1;i<num.length;i++) {
			
			if(num[i]>largest) {
				largest=num[i];
			}
			//else(smallest<num[i]){
				
			
			
			
		}
		System.out.println(largest);
	}

}
