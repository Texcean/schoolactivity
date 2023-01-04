import java.util.Scanner;

public class Prjwhileloop {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int m = 0;

        do {
            System.out.print("Please enter a number: ");
            num = sc.nextInt();

            System.out.println("Input: " + num);
            m++;
        }while (m<=5);
    }
}
