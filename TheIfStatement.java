import java.io.InputStream;
import java.util.Scanner;

public class TheIfStatement {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Price of Egg per piece: ");
        float Price = input.nextFloat();

        System.out.print("Quota per Day: ");
        int Quota = input.nextInt();

        float tSale = Price * Quota;

        System.out.println();
        System.out.println("Total Sale: " + tSale);

        if(tSale >= 360.00) System.out.println("Achieve!");
        else System.out.println("Not Achieve");
        
       
 

    }
    
}
