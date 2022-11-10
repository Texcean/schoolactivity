import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int length, width, sqm, tprice;
        String type;

        System.out.print("Please enter the value of the length: ");
        length = sc.nextInt();
        System.out.print("Please enter the value of the width: ");
        width = sc.nextInt();
        sqm = length * width;
        System.out.print("The value of square metre: " + sqm);

        
        System.out.print("Type of area: ");
        type = sc.next();

        if((type).equals("AFFORDABLE")) {
            tprice = sqm * 74000;
            System.out.println("Type of area: AFFORDABLE");
            System.out.println("Price per Square Metre: P74,000");
            System.out.println("The total price per square metre is: " + tprice);
        }else if((type).equals("MIDDLE")) {
            tprice = sqm * 115000;
            System.out.println("Type of area: MIDDLE");
            System.out.println("Price per Square Metre: P115,000");
            System.out.println("The total price per square metre is: " + tprice);
        }else if((type).equals("HIGH-END")) {
            tprice = sqm * 171000;
            System.out.println("Type of area: HIGH-END");
            System.out.println("Price per Square Metre: P171,000");
            System.out.println("The total price per square metre is: " + tprice);
        }else if((type).equals("LUXURY")) {
            tprice = sqm * 225000;
            System.out.println("Type of area: LUXURY");
            System.out.println("Price per Square Metre: P225,000");
            System.out.println("The total price per square metre is: " + tprice);
        }

    
    }
}