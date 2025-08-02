import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        } catch (Exception e) {
           
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next(); 

      
        int customLength = findLength(input);

        int builtInLength = input.length();

        System.out.println("Length (without using length()): " + customLength);
        System.out.println("Length (using length()): " + builtInLength);
        
        sc.close();
    }
}
