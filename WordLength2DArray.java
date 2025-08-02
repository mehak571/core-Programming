import java.util.Scanner;

public class WordLength2DArray {

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

        words[index] = word;
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

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);

       
        String[][] wordLengthArray = getWordLengthArray(words);

  
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");

        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int len = Integer.parseInt(wordLengthArray[i][1]); // convert back to int
            System.out.println(word + "\t\t" + len);
        }

        sc.close();
    }
}
