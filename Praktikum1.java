import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tugas, kuis, uts, uas, nilaiAkhir;
        String nilaiHuruf = "";

        System.out.println("\nProgram Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        uas = input.nextDouble();

        
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
            return;
        }

        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) nilaiHuruf = "A";
        else if (nilaiAkhir > 73) nilaiHuruf = "B+";
        else if (nilaiAkhir > 65) nilaiHuruf = "B";
        else if (nilaiAkhir > 60) nilaiHuruf = "C+";
        else if (nilaiAkhir > 50) nilaiHuruf = "C";
        else if (nilaiAkhir > 39) nilaiHuruf = "D";
        else nilaiHuruf = "E";

        System.out.println("==============================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("==============================");
        System.out.println(nilaiAkhir >= 50 ? "SELAMAT ANDA LULUS" : "ANDA TIDAK LULUS");
    }
}
