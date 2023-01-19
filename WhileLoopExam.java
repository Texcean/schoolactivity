public class WhileLoopExam {

    public static void main(String[] args) {
        
        int sYear = 1900;
        int eYear = 2100;

        while(sYear <= eYear) {

            System.out.println("Leap Year: " + sYear);
            sYear = sYear + 3;
            sYear++;
        }
    }
 
}
