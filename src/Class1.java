import java.io.Console;  

public class MyApp {
    public static void main(String [] args) {
        Console c = System.console(); 
        int luku = 1;
        while (luku < 11){
        System.out.println(luku);
        luku = luku + 1;
        }
    }
}