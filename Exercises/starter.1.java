import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
    
    x = 5;       //Declaring x
    x = rand.nextInt(46); //0-45
    System.out.println(x);
    
    // 5-50
    x = rand.nextInt(46) + 5; // 0 - 45
                              // 5 - 50
    // 10 - 65
    // 65 - 10 = 56
    x = rand.nextInt(56);  // 0 - 55
    
    double a;
    a = 0;
    a = rand.nextDouble(); // 0-1, not 1
    System.out.println(a);
    
    a = a + 12.5;
    System.out.println(a);
     //35.3 - 36.3
     // 0   - 1
     double b;
     b = rand.nextDouble();
     System.out.println(b);
     b = b + 35.3;
     System.out.println(b);
     //double between 5 - 205
     double c;
     c = rand.nextInt(200);    //0-199
     System.out.println(c);
     c = c + 5;                //5-204
    
	}
}
