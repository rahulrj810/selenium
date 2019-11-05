package corejava;

public class Override extends Method_overloading {
	public void sum(int i,int l) {
		System.out.println(i-l);
	}
	public static void main(String args[]) {
		
		Method_overloading obj=new Method_overloading();
		obj.sum(10, 5);
		Override ob=new Override();
		ob.sum(10, 5);
		
	}

}
