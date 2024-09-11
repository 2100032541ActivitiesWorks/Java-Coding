import java.util.*;

public class Main{
	public static void main(String[] args) {
	    int a, b, c, d, e;
	    float f;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your First number:");
	    a = sc.nextInt();
	    System.out.println("Enter your Second number:");
	    b = sc.nextInt();
	    c = a + b;
	    d = a - b;
	    e = a * b;
	    System.out.println("The Total solution is: "+c);
	    System.out.println("The Total solution is: "+d);
	    System.out.println("The Total solution is: "+e);
	    if (b!=0){
	        f = a / b;
	        System.out.println("The Total solution is: "+f);
	    }
	    else{
	        System.out.println("Invalid Error");
	    }
	    sc.close();
	}
}
