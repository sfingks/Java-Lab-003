import java.util.Scanner;

public class GettingHotInHere {
    /**
     *  * @author Trevor Hartman
     *  * @author MK Ripley
     *  *
     *  * @since Version 1.0
     *  * 2/3/2023
     * Weather calculations.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int number = scanner.nextInt(); //degrees (F) by user input
        int numberWarmer = (number + 2); //two degrees (F) over the user input
        double C = (number - 32.0) * (5.0/9.0); //the precise calculations for C of original F input
        double cWarmer = (numberWarmer - 32.0) * (5.0/9.0); //the precise calculations for C from 2 degrees above original input (F)
        int intC = (int) C; //converting the precise C calculation to int form
        System.out.printf("%d°F\n%f°C\n%d°C\nIf it were two degrees warmer it would be: %d°F and %f°C",number,C,intC,numberWarmer,cWarmer); //output string

        //instead of making it 2 degrees warmer in C, I decided to make the two degrees warmer based on the users input unit (F) and recalculated for C



    }
}
