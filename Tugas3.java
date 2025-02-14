import java.util.Scanner;

public class Tugas3 {
    static Scanner input = new Scanner(System.in);
    static int MK;
    static String[] namaMataKuliah;
    static int[] sks;
    static int[] semester;
    static String[] hariKuliah;

    public static void main(String[] args) {
        int menu = 0;

        System.out.print("Masukkan jumlah mata kuliah: ");
        MK = input.nextInt();
        input.nextLine(); 

        namaMataKuliah = new String[MK];
        sks = new int[MK];
        semester = new int[MK];
        hariKuliah = new String[MK];

        inputData();

        while (menu != 5) {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine();  

            if (menu == 1) {
                tampilkanSeluruhJadwal();
            } else if (menu == 2) {
                tampilkanJadwalBerdasarkanHari();
            } else if (menu == 3) {
                tampilkanJadwalBerdasarkanSemester();
            } else if (menu == 4) {
                cariMataKuliah();
            } else if (menu == 5) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Menu tidak valid. Silakan coba lagi.");
            }
        }
        input.close();
    }

    static void inputData() {
        for (int i = 0; i < MK; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = input.nextLine();
            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = input.nextLine();
        }
    }

    static void tampilkanSeluruhJadwal() {
        System.out.println("\n==================== SELURUH JADWAL KULIAH ====================");
        System.out.printf("%-25s %-10s %-10s %-10s%n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < MK; i++) {
            System.out.printf("%-25s %-10d %-10d %-10s%n", namaMataKuliah[i], sks[i], semester[i], hariKuliah[i]);
        }
    }

    static void tampilkanJadwalBerdasarkanHari() {
        System.out.print("\nMasukkan hari kuliah yang dicari: ");
        String hariDicari = input.nextLine();
        System.out.println("\n========= JADWAL KULIAH HARI " + hariDicari.toUpperCase() + " =========");
        System.out.printf("%-25s %-10s %-10s%n", "Mata Kuliah", "SKS", "Semester");
        System.out.println("------------------------------------------");
        boolean ditemukan = false;

        for (int i = 0; i < MK; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hariDicari)) {
                System.out.printf("%-25s %-10d %-10d%n", namaMataKuliah[i], sks[i], semester[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada hari tersebut.");
        }
    }

    static void tampilkanJadwalBerdasarkanSemester() {
        System.out.print("\nMasukkan semester yang dicari: ");
        int semesterDicari = input.nextInt();
        input.nextLine();
        System.out.println("\n========= JADWAL KULIAH SEMESTER " + semesterDicari + " =========");
        System.out.printf("%-25s %-10s %-10s%n", "Mata Kuliah", "SKS", "Hari");
        System.out.println("------------------------------------------");
        boolean ditemukan = false;

        for (int i = 0; i < MK; i++) {
            if (semester[i] == semesterDicari) {
                System.out.printf("%-25s %-10d %-10s%n", namaMataKuliah[i], sks[i], hariKuliah[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah di semester tersebut.");
        }
    }

    static void cariMataKuliah() {
        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String namaDicari = input.nextLine();
        System.out.println("\n===================== HASIL PENCARIAN =====================");
        System.out.printf("%-25s %-10s %-10s%n", "Mata Kuliah", "SKS", "Semester" , "Hari");
        System.out.println("===============================================================");
        boolean ditemukan = false;

        for (int i = 0; i < MK; i++) {
            if (namaMataKuliah[i].equalsIgnoreCase(namaDicari)) {
                System.out.printf("%-25s %-10d %-10d %-10s%n", namaMataKuliah[i], sks[i], semester[i], hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}