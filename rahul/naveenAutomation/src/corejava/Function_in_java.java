package corejava;

public class Function_in_java {
	public static void main(String args[]){
		
		Function_in_java obj= new Function_in_java();
		int f=obj.avn(40,20);
		System.out.println(f);
		int g=obj.main();
		System.out.println(g);
		obj.test();

	}
	public int main() {//no input with output
		System.out.println("main");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
		
	}
	public int avn(int x, int y) {//input with some output
		System.out.println("avn");
		int d=x/y;
		return d;
		
	}
	public void test() {//no input with no output
		System.out.println("mridul");
		
	}

}
