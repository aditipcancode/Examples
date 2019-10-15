import java.util.Scanner;

public class ReadingInputUser {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        {
            sum += number;
            count++;
        }
        if (count == 10) {
            System.out.println("Invalid");
        }


    }


}
