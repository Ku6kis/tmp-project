import java.io.Console;  

public class MyApp {
    public static void main(String [] args) {
        Console c = System.console(); 

        String OriginalWord = c.readLine("give a word, any word:D!  : ");



        
            while (true) {
            String WordAfter = c.readLine("Give a word that differs in only one letter: ");

            if (isOneLetterAway(OriginalWord, WordAfter)) {
                System.out.println("Let's continue!");
                currentWord = nextWord;
            } else {
                System.out.println("Wrong!");
                break;
            }
        }
        
        }
    }



}