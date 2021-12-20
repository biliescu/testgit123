package homework5;

public class SecondEx {
	public static void main(String[] args) {

		forEx();
		System.out.println();
		whileEx();
		
		
	}
	
	private static void forEx() {
		int n1 = 0, n2 = 1, Fn, i;
		System.out.print("Seria Fibonacci pentru 9 numere este:" +n1 + " " + n2);

		for (i = 2; i < 9; ++i)
		{
			Fn = n1 + n2;
			System.out.print(" " + Fn);
			n1 = n2;
			n2 = Fn;
		}
	}
	
	private static void whileEx() {
		int n1 = 0, n2 = 1, Fn, i=2;
		System.out.print("Seria Fibonacci pentru 9 numere este:" +n1 + " " + n2);
		while (i<9) {
			Fn = n1 + n2;
			System.out.print(" " + Fn);
			n1 = n2;
			n2 = Fn;
			i++;
			
		}
		
	}
}
