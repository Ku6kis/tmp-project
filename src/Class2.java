import java.io.Console;

// This program asks the user for a word and keeps asking for new words
// that differ by exactly one letter from the previous one.
public class MyApp {
    public static void main(String [] args) {
        Console c = System.console(); // Get the console for user input

        // Ask the user to enter the first word
        String OriginalWord = c.readLine("give a word, any word:D!  : ");

        // Keep asking for new words until the user enters one that is not one letter away
        while (true) {
            // Ask for a word that differs by exactly one letter
            String WordAfter = c.readLine("Give a word that differs in only one letter: ");

            // Check if the new word is one letter away from the original
            if (isOneLetterAway(OriginalWord, WordAfter)) {
                System.out.println("Let's continue!"); // If yes, continue the game
                OriginalWord = OriginalWord.toLowerCase(); // Convert original word to lowercase
                WordAfter = WordAfter.toLowerCase(); // Convert new word to lowercase
                OriginalWord = WordAfter; // Update the original word for the next round
            } else {
                // If not, end the game
                System.out.println("Sorry that word is not one letter away, thanks for playing tho!");
                break; // Exit the loop
            }
        }
    }

    // This method checks if two words differ by exactly one letter
    public static boolean isOneLetterAway(String a, String b) {
        if (a.length() != b.length()) {
            return false; // If lengths are different, they can't be one letter apart
        }

        int DIFFERENCES = 0; // Counter for number of differing characters
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                DIFFERENCES++; // Increment counter if characters at same position differ
            }
        }

        return DIFFERENCES == 1; // Return true only if exactly one letter differs
    }
}
