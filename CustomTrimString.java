import java.util.Scanner;

public class CustomTrimString {

    public static int[] getTrimIndices(String str) {
        int len = 0;

        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {
            // Length found
        }

        int start = 0;
        int end = len - 1;

        // Trim leading spaces
        while (start < len && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

  
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (Exception e) {}

        try {
            while (true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (Exception e) {}

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = sc.nextLine();

        int[] indices = getTrimIndices(input);

       
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();

      
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        System.out.println("\nCustom Trimmed String: \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trimmed String: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both strings equal? " + areEqual);

        sc.close();
    }
}
