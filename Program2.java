import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your First number:");
	    int a = sc.nextInt();
	    System.out.println("Enter your Second number:");
	    int b = sc.nextInt();
	    if (b!=0){
	        float c = a / b;
	        System.out.println("The Solution is: "+c);
	    }
	    else {
	        System.out.println("Invalid Usage");
	    }
	}
}
