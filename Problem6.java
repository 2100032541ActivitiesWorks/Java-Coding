import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the given number by your choice:");
		double number = sc.nextDouble();
		double squareRoot = Math.sqrt(number);
		System.out.println("The Square root of "+number+" is "+squareRoot);
		sc.close();
	}
}
