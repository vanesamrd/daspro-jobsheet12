import java.util.Scanner;
public class Tugas1 {

    public static void deretRekursif(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print(n + " ");
        deretRekursif(n - 1); 
    }

    
    public static void deretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10; 

        System.out.println("Hasil menggunakan fungsi rekursif:");
        deretRekursif(n);

        System.out.println("\nHasil menggunakan fungsi iteratif:");
        deretIteratif(n);
    }
}
    
