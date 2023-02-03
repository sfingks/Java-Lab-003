// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Scanner;

public class MrRoboto {
    /**
     *  * @author Trevor Hartman
     *  * @author MK Ripley
     *  *
     *  * @since Version 1.0
     *  * 2/3/2023
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Concatenate the user response to this String.
        String domo = "Domo arigato ";

        System.out.print("My name is Mr. Roboto, are you Kilroy? ");
        // Write your program here

        String typedByUser = scanner.nextLine(); //getting the user input
        System.out.println(domo + typedByUser); //printing the user input with preface "Domo arigato "
    }
}
