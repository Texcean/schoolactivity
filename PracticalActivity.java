import java.util.Scanner;
public class PracticalActivity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String cBrand, tSize;
        
		
		System.out.print("Enter Clothing Brand: ");
		cBrand = input.nextLine();

        System.out.print("Enter The Size: ");
		tSize = input.nextLine();

		
		switch (cBrand) {
		    case "Bench":
		    System.out.println("The Clothing Brand you pick is: Bench ");
		    break;
		    case "Penshoppe":
		    System.out.println("The Clothing Brand you pick is: Penshoppe");
		    break;
		    case "Shein":
		    System.out.println("The Clothing Brand you pick is: Shein");
		    break;
            default:
            System.out.println("The Brand you pick: Brand not available!");
		}
        switch (tSize) {
		    case "Small":
		    System.out.println("The size you pick is: Small ");
		    break;
		    case "Medium":
		    System.out.println("The size you pick is: Medium");
		    break;
		    case "Large":
		    System.out.println("The size you pick is: Large");
		    break;
            default:
            System.out.println("The size you pick: Size not available!");
            
		   
		}
       
	}
}