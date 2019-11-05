package corejava;

public class Array_oned {
	public static void main(String args[]) {
		//to similar data type value in a array variable
		//adv and dis of array
		// size is fixed
		//store only similar data type:to over come this problem we used object  array
	int i[]=new int[3];
	System.out.println(i.length);
	i[0]=10;
	i[1]=20;
	i[2]=30;
	//printing all value using loop
	
	for(int j=0;j<i.length;j++) {
		System.out.println(i[j]);
		}
	
	String s[]= new String[3];
	s[0]="rahul";
	s[1]="raj";
	s[2]="gumla";
	for(int k=0;k<s.length;k++) {
		System.out.println(s[k]);
	}
		
	//object is super class of all classes
Object ob[]= new Object[4];
  ob[0]="rahul";
  ob[1]= 20;
  ob[2]='m';
  ob[3]="16/01.94";
  
  for(int obj=0;obj<ob.length;obj++) {
	  System.out.println(ob[obj]);
  }
  
  
		
	}

}
