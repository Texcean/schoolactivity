import java.util.Scanner;

public class petacomprog {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		int fnumber, snumber, result;
		
		System.out.print("Please enter your First Number: ");
		fnumber = input.nextInt();
		
		System.out.print("Please enter your Second Number: ");
		snumber = input.nextInt();
		
		result = fnumber + snumber;
		System.out.println("The SUM of the First and Second Number is: " + result);
		result = fnumber - snumber;
		System.out.println("The DIFFERENCE of the First and Second Number is: " + result);
		result = fnumber * snumber;
		System.out.println("The PRODUCT of the First and Second Number is: " + result);
		float result_2 = fnumber / snumber;
		System.out.println("The QUOTIENT of the First and Second Number is: " + result_2);
		
		// Santos, James Michael R.
		
		// ICT - MESSENGER
		
		// PERFORMANCE TASK
	}

}
