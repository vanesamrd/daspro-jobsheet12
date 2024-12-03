import java.util.Scanner;
public class Tugas3 {
    
    public static int fibonacci(int n) {
        if (n == 0) return 0; 
        if (n == 1) return 1; 
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int bulan = 12; 
        int[] jumlahPasangan = new int[bulan];

        for (int i = 0; i < bulan; i++) {
            jumlahPasangan[i] = fibonacci(i);
        }

        System.out.printf("%-10s %-15s %-15s %-15s\n", "Bulan", "Jumlah Produk", "Belum Lahir", "Total Pasangan");
        System.out.println("------------------------------------------------------");
        
        for (int i = 0; i < bulan; i++) {
            int belumLahir = (i == 0) ? 0 : jumlahPasangan[i - 1];
            System.out.printf("%-10d %-15d %-15d %-15d\n", i + 1, jumlahPasangan[i], belumLahir, jumlahPasangan[i]);
        }
    }
}
