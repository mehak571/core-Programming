import java.util.Scanner;

public class ShortestAndLongestWordFinder {

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

        String[] words = new String[wordCount];
        String word = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word; // last word

        return words;
    }

    public static String[][] getWordLengthArray(String[] words) {
        int n = words.length;
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            String word = words[i];
            int len = getLength(word);
            result[i][0] = word;
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordArray) {
        int minLen = Integer.parseInt(wordArray[0][1]);
        int maxLen = Integer.parseInt(wordArray[0][1]);

        for (int i = 1; i < wordArray.length; i++) {
            int length = Integer.parseInt(wordArray[i][1]);

            if (length < minLen) {
                minLen = length;
            }
            if (length > maxLen) {
                maxLen = length;
            }
        }

        return new int[]{minLen, maxLen};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);

        String[][] wordLengthArray = getWordLengthArray(words);

        int[] result = findShortestAndLongest(wordLengthArray);

       
        System.out.println("\nWords and Their Lengths:");
        System.out.println("Word\t\tLength");
        System.out.println("------------------------");

        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t\t" + Integer.parseInt(wordLengthArray[i][1]));
        }

        System.out.println("\nShortest Word Length: " + result[0]);
        System.out.println("Longest Word Length: " + result[1]);

        sc.close();
    }
}
