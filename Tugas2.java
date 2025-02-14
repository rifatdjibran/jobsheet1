import java.util.Scanner;

public class Tugas2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;

        while (menu != 4) {
            System.out.println("\n=== Menu Perhitungan Kubus ===");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();

            if (menu == 1) {
                hitungVolume(input);
            } else if (menu == 2) {
                hitungLuasPermukaan(input);
            } else if (menu == 3) {
                hitungKeliling(input);
            } else if (menu == 4) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Menu tidak valid. Silakan coba lagi.");
            }
        }
        input.close();
    }

    static void hitungVolume(Scanner scanner) {
        System.out.print("\nMasukkan panjang sisi kubus: ");
        int sisi = scanner.nextInt(); 
        int volume = sisi * sisi * sisi; 
        System.out.println("Volume kubus: " + volume);
    }

    static void hitungLuasPermukaan(Scanner scanner) {
        System.out.print("\nMasukkan panjang sisi kubus: ");
        int sisi = scanner.nextInt(); 
        int luasPermukaan = 6 * sisi * sisi;
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }

    static void hitungKeliling(Scanner scanner) {
        System.out.print("\nMasukkan panjang sisi kubus: ");
        int sisi = scanner.nextInt();
        int keliling = 12 * sisi;
        System.out.println("Keliling kubus: " + keliling);
    }
}
