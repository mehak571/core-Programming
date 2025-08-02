public class ASCIIValueDisplay {

    // Method to find ASCII values of characters in a string
    public static int[][] findASCIIValues(String text) {
        int[][] asciiValues = new int[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            asciiValues[i][0] = text.charAt(i);      // Character as int
            asciiValues[i][1] = (int) text.charAt(i); // ASCII value
        }
        return asciiValues;
    }

    // Method to display the characters and their ASCII values
    public static void displayASCIIValues(String text, int[][] charASCIIValues) {
        System.out.println("Characters and their corresponding ASCII values for \"" + text + "\" are:");
        for (int i = 0; i < charASCIIValues.length; i++) {
            System.out.println((char)charASCIIValues[i][0] + " - " + charASCIIValues[i][1]);
        }
    }

    public static void main(String[] args) {
        String text = "AaBb";
        int[][] charASCIIValues = findASCIIValues(text.trim());
        displayASCIIValues(text, charASCIIValues);
    }
}
