import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;

        int count = 0;
        int n = number;
        while (n != 0) {
            count++;
            n /= 10;
        }

        int[] digits = new int[count];
        n = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        int[] freq = new int[10]; 

        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

     
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i] + " time(s)");
            }
        }
    }
}
