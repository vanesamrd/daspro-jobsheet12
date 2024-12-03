import java.util.Scanner;
public class Tugas2 {
    
    public static int jumlahBilangan(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + jumlahBilangan(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif: ");
        int f = scanner.nextInt();

        int hasil = jumlahBilangan(f);
        System.out.println("Hasil penjumlahan dari 1 hingga " + f + " adalah: " + hasil);
        
    }
}

