import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mataKuliah = {"Pancasila","Konsep Teknologi Informasi",
                               "Critical Thinking and Problem Solving","Matematika Dasar",
                               "Bahasa Inggris","Dasar Pemrograman","Praktikum Dasar Pemrograman",
                               "Keselamatan dan Kesehatan Kerja (K3)"
                            };

        int[] sks = {2, 3, 2, 3, 2, 3, 4, 2}; 
        int[] nilaiAngka = new int[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        System.out.println("\nProgram Menghitung IP Semester");
        System.out.println("====================================");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai untuk MK " + mataKuliah[i] + " : ");
            nilaiAngka[i] = input.nextInt(); 

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;

            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;

            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;

            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;

            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;

            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;

            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }
        }

        double totalBobot = 0;
        int totalSKS = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            totalBobot += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }
        double IP = totalBobot / totalSKS;

        System.out.println("\nHasil Konversi Nilai:");
        System.out.println("=========================================================================================");

        System.out.printf("%-40s %-10s %-10s %-10s %-10s\n", "Mata Kuliah", "SKS", "Nilai Angka  ", "Nilai Huruf  ", "Bobot Nilai");

        System.out.println("=========================================================================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-11d %-13d %-14s %-17.2f\n", mataKuliah[i], sks[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("=========================================================================================");
        System.out.printf("IP : %.2f\n", IP);
        System.out.println("=========================================================================================");
        
        input.close();
    }
}
