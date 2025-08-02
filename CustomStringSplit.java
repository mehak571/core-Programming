import java.util.Scanner;

public class CustomStringSplit {

    public static int getLength(String str) {
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

 
    public static String[] customSplit(String str) {
        int len = getLength(str);
        int wordCount = 1; 

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount + 1]; // +1 for end
        int idx = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

        spaceIndexes[idx++] = len; 
        String[] result = new String[wordCount];
        int start = 0;
        int w = 0;

        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i];
            String word = "";

            for (int j = start; j < end; j++) {
                word += str.charAt(j);
            }

            result[w++] = word;
            start = end + 1;
        }

        return result;
    }

    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length)
            return false;

        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] custom = customSplit(input);

        String[] builtin = input.split(" ");

     
        boolean areEqual = compareArrays(custom, builtin);

        System.out.println("\nCustom Split:");
        for (String word : custom) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split:");
        for (String word : builtin) {
            System.out.println(word);
        }

        System.out.println("\nAre both arrays equal? " + areEqual);
        sc.close();
    }
}
