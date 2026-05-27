import java.util.Scanner;

public class sumOfFiveNumbers{

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int count = 1;

        int sum = 0;
        
        while (count <= 5 ) {

            System.out.print("Enter a number: ");

            int number = userInput.nextInt();

            sum += number;
    
            

            count++;
        }

        System.out.print(sum + " ");

    }

}
