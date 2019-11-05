package corejava;

public class Local_global {
	String name="rahul";//global variable 
	int age=21;
	public static void main(String args[]){
		int i=10;//local variable
		Local_global obj=new Local_global();
		System.out.println(i);
		System.out.println(obj.name);
		obj.main();
		
		
	}
	public void main() {
		int i=15;
		System.out.println(i);
		System.out.println(name);
		System.out.println(age);
	}

}
