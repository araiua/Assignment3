import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        boolean validInput = false;

        while(!validInput) {
            try {
                a = scanner.nextInt();

                b = scanner.nextInt();

                validInput = true;
            } catch (InputMismatchException e){
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
        System.out.println(a+b);
        scanner.close();
    }
}
