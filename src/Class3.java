// Make great code here


import java.io.Console;  

public class MyApp {
    public static void main(String [] args) {
        Console c = System.console(); 

        System.out.println("Anna luku");
        int luku = Integer.parseInt(c.readLine());
        System.out.println("Anna luku");
        int pasi = Integer.parseInt(c.readLine());
        if (luku>pasi)
         System.out.println(luku);
         if (luku<pasi)
         System.out.println(pasi);
    }
}