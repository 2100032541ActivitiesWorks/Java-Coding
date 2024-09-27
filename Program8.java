import java.util.*;

public class Main{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter the given number by your choice:");
		double number = sc.nextDouble();
		double squareRoot = Math.sqrt(number);
		double cubeRoot = Math.cbrt(number);
		System.out.println("Enter the root of your choice:");
		double root = sc.nextDouble();
		double nthRoot = Math.log(number) / Math.log(root);
		System.out.println("The Square root of "+number+" is "+squareRoot);
		System.out.println("The Cube root of "+number+" is "+cubeRoot);
		System.out.println("The main root of "+number+" is "+nthRoot);
		sc.close();
	}
}
