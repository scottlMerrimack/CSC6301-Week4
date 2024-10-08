import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class serves as the entry point for the Number Processing System.
 * 
 * @author Troy Scott
 * @version 1.0.0
 * @since Week 4 of CSC62302
 */

 public class Main {

    /**
     * This is the default constructor for the Main class.  No code has been added here.
     */
    
    Main(){

    }

        /**
         * Main method to run the program.  The method does not return a value  The program provider the user with a prompt to enter an integer.   
         * The program completes once the user enters a 0 (zero).
         * The method reuses util.Scanner to prompt for user input
         * The method reuses util.ArrayList to store Integer values entered by the user.
         * @param args the default parameter for main
         * @throws InputMismatchException if the user enters a value that is not an integer.
        */
        public static void main(String[] args) {

           ListProcessor myList = new ListProcessor();  //instantiates ListProcessor object
           ArrayList<Integer> inputList = new ArrayList<>();  //instatiates ArrayList to capture user's entries.
           Scanner scanner = new Scanner(System.in);  //Creates the scanner object for user input.
           Integer input;
           boolean validInput = false;  //control's the loop
            //User input
           while (!validInput) {
            try {
                System.out.print("Enter an integer (type '0' when complete ):  ");
                input = scanner.nextInt();
                if (!input.equals(0)){
                        //checks to see if the number exists in the list.
                    if (!inputList.contains(input)){
                        inputList.add(input);
                        System.out.println("Added integer: " + input);
                    }
                    else
                    {
                        System.out.println("The integer " + input + " already exists in list. ");
                    }
                }
                else
                {

                    validInput=true;
                }

            }
            //catches user input error
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer. (type '0' if complete )");
                scanner.next();
            }
        }
           scanner.close();
           
           myList.addArrayList(inputList);
           myList.displayList();
           System.out.println("Application Has Ended!!");
        }
}
