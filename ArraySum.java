import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];  
        double total = 0.0;                
        int index = 0;                     

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <= 0) {
                break;
            }

            if (index == 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            numbers[index] = input;  
            index++;                 
        }

        System.out.println("\nYou entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        
        System.out.println("Total sum = " + total);

        sc.close();
    }
}
