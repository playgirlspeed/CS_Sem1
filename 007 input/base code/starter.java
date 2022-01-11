import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name?");
		String text = sc.nextLine ();
		
		System.out.println("What is your age?");
		int number1 = sc.nextInt ();
		
		System.out.println("What month were you born?");
		int number2 = sc.nextInt ();
		
		System.out.println("What day were you born?");
		int number3 = sc.nextInt ();
		
		System.out.println("What year were you born?");
		int number4 = sc.nextInt ();
		
		System.out.println("How much is a buck fifty");
		double number5 = sc.nextDouble ();
		
	}
}
