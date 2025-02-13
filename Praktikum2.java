import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long nim;
        int n;

        System.out.print("\nMasukkan NIM: ");
        nim = input.nextLong(); 

        n = (int) (nim % 100); 

        if (n < 10) {
            n += 10; 
        }

        System.out.println("===================");
        System.out.println("n: " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) continue; 
            
            System.out.print((i % 2 == 1) ? "* " : i + " "); 
        }
        
        System.out.println(); 
    }
}
