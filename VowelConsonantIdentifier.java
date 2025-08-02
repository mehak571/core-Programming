import java.util.Scanner;

public class VowelConsonantIdentifier {

    public static String getCharType(char ch) {
        
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // Convert to lowercase
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static String[][] analyzeCharacters(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {
          
        }

        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharType(ch);
        }

        return result;
    }

  
    public static void displayResult(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println("   " + data[i][0] + "\t\t" + data[i][1]);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] analysis = analyzeCharacters(input);
        displayResult(analysis);

        sc.close();
    }
}
