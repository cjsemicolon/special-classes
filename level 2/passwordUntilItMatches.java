import java.util.Scanner;

public class passwordUntilItMatches{

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String password = "ceejay1234";
        
        while (true) {

            System.out.print("Enter password: ");

            String input = userInput.nextLine();

            if(input .equals(password)) {

                break;    
    
            }
    
        }

    }

}
