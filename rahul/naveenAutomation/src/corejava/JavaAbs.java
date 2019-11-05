package corejava;

public class JavaAbs {

	public static void main(String[] args) {
		Bank obj = new ICICI();
		obj.credit();
		obj.debit();
		obj.add();

	}

}

abstract class Bank {

	public void add() {
		System.out.println("Hi add method");
	}

	abstract void credit();

	abstract void debit();
}

class ICICI extends Bank {

	public ICICI() {
		super();
		
	}

	void credit() {
		System.out.println("atul LM");

	}

	public void add() {
		
		System.out.println("Hi add ");
	}

	void debit() {
		System.out.println("kutta bho bho");

	}

}
