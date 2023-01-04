import javax.swing.*;
public class Stopwhileloop {

public static void main(String[] args) {

int control = 1;

while( true ) {
    String value = JOptionPane.showInputDialog( "Enter STOP to stop the loop" );
    System.out.println( value );
    if ( "STOP".equals(value) ) {
        break;
    }
}
}
}