import java.util.Scanner;
import java.util.Random;

public class ArrayIndex {
    public static void main(String[] args){
        int[] data = new int[100];
        Random random = new Random();

        for (int i = 0; i < data.length; i++){
            data[i] = random.nextInt(1000);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("The index of the array(0-99; ");

        try {
            int index = input.nextInt();
            System.out.println("The element at index " + index + " is " + data[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds");
        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
        finally {
            input.close();
        }
    }
}
