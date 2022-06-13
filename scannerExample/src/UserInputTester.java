import java.util.Scanner;

public class UserInputTester {
    public static void main(String[] args){
        /**
         * This uses the Scanner to accept user input that are only Strings
         * uses a try and catch to handle any error.
         *
         * @param scanner to get user input from terminal.
         *
         */
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter a String");
            String userInput = scanner.nextLine();
            System.out.println("User Input: " + userInput);
        }catch (Exception ex){
            ex.getLocalizedMessage();
        }finally {
            scanner.close();
        }
    }
}
