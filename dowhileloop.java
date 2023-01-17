import java.util.Scanner;

class dowhileloop {
    public static void main(String[] args) {
        Scanner jm = new Scanner(System.in);
        
        String tName = "";
        int n = 0;

        while (!tName.equals("STOP")) {
            System.out.println("Enter any Name: " + n + ": " + tName);
            tName = jm.next();
            n++;

            
            // James Michael R. Santos
            // ICT - MESSENGER
        }
    }
}