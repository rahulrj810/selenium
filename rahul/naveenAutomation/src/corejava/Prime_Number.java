package corejava;

public class Prime_Number {

	public static boolean sum(int num) {
		System.out.println();
		if (num <= 1) {
			System.out.println("number is prime");
			return false;
		}

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}
	public static void getprimenumber(int num) {
		for(int i=2;i<=num;i++) {
			if(sum(i))
				System.out.print(i +" ");
		}
	}

	public static void main(String... args) {
		

		System.out.println("2 ie prime number"+sum(2));
		System.out.println("25 ie prime number"+sum(25));
		System.out.println("9 ie prime number"+sum(9));
		System.out.println("7 ie prime number"+sum(7));
		getprimenumber(20);
		
	}
}
