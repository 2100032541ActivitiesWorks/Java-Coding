import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();
		if (year % 4 == 0 || year % 400 == 0){
		    System.out.println("The Given year "+year+" is leap year");
		}
		else{
		    System.out.println("The year is not leap year");
		}
	}
}
