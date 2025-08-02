import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        // First, check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first string: ");
        String string1 = scanner.next();

        System.out.print("Enter second string: ");
        String string2 = scanner.next();

        // Compare using charAt()
        boolean charAtResult = compareUsingCharAt(string1, string2);

        // Compare using built-in equals() method
        boolean equalsResult = string1.equals(string2);

        // Display results
        System.out.println("\nComparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);

        // Check if both methods give the same result
        if (charAtResult == equalsResult) {
            System.out.println("✅ Both methods give the same result.");
        } else {
            System.out.println("❌ Methods give different results.");
        }

        scanner.close();
    }
}
