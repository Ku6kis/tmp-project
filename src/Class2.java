import java.io.Console;

public class MyApp {
    public static void main(String [] args) {
        Console c = System.console();

        String OriginalWord = c.readLine("give a word, any word:D!  : ");




            while (true) {
            String WordAfter = c.readLine("Give a word that differs in only one letter: ");

            if (isOneLetterAway(OriginalWord, WordAfter)) {
                System.out.println("Let's continue!");
                OriginalWord = OriginalWord.toLowerCase();
                WordAfter = WordAfter.toLowerCase();
            } else {
                System.out.println("Wrong!");
                break;
            }
        }

        }
    }

    public static boolean isOneLetterAway(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int DIFFERENCES = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                DIFFERENCES++;
            }
        }

        return DIFFERENCES == 1;
    }
}



}