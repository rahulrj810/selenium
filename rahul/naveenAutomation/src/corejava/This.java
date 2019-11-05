package corejava;

public class This {
	
	
	
	int i =10;
	
	public void sum ()
	{
		int i =20;
		System.out.println(i+this.i);
	}
	
	public static void main(String[] args) {
		This t = new This();
		t.sum();
		
	}
}
