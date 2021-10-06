package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Test Automation University");
        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMeAngie");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */

    private static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text should contain %d words:", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */

    private static void reverseString(String text) {
        for(int i = text.length() - 1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }

    /**
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */

    private static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++) {
            //we want the spaces added after the first word, so we skip the first index
            if(i != 0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
