import java.io.Console;

// This program prints numbers from 1 to 10 using a while loop
public class MyApp {
    public static void main(String [] args) {
        int luku = 1; // Initialize variable 'luku' with value 1
        while (luku < 11) { // Continue loop while 'luku' is less than 11
            System.out.println(luku); // Print the current value of 'luku'
            luku = luku + 1; // Increment 'luku' by 1
        }
    }
}