package corejava;

public class Method_overloading {
	public static void main(String args[]) {
		Method_overloading obj= new Method_overloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		
	}
	
	public static void main(int i) {
		
	}
	public static void main(String name) {
		
	}
	
	//when a method name is same with different argument or input parameter within the class 
	
	
	
	public void sum() {// zero parameter
		System.out.println("zero parameter");
		
	}
	public void sum(int i) {// one parameter 
		System.out.println("one parameter");
		System.out.println(i);
		
	}
	public void sum(int i,int l) {// two parameter 
		System.out.println("two parameter");
		System.out.println(i+l);
		
		
	}

}
