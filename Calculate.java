import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your First number:");
	    int a = sc.nextInt();
	    System.out.println("Enter your Second number:");
	    int b = sc.nextInt();
	    int c = a + b;
	    int d = a - b;
	    int e = a * b;
	    System.out.println("The Total solution is: "+c);
	    System.out.println("The Total solution is: "+d);
	    System.out.println("The Total solution is: "+e);
	    sc.close();
	}
}
