import java.util.Scanner;
public class PrjMTreview {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final float cPrize = 1.50f;
		int cDozen, tCandy;
		float sPrize, rCandy;
		
		System.out.print("Please input the total number of Candies: ");
		tCandy = input.nextInt();
		
		System.out.println("The total number of Candies are: " + tCandy);
		cDozen = tCandy / 12;
		rCandy = tCandy % 12;
		sPrize = tCandy * 150f;
		
		System.out.println("The total number of Dozens we can get are: " + cDozen);
		
		System.out.println("The total remaining numbers of Candies are: " + rCandy);
		
		
		System.out.println("The Total sPrize are: " + sPrize);
		
		
		
		

	}

}
