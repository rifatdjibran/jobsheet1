public class Praktikum4 {
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12},  
            {2, 10, 10, 5},  
            {5, 7, 12, 9}    
        };

        int[] harga = {75000, 50000, 60000, 10000}; 

        tampilkanTotalStock(stock);

        tampilkanPendapatan(stock, harga);

        int[] bungaMati = {-1, -2, 0, -5};
        kurangiStockKarenaBungaMati(stock, bungaMati);
    }

    public static void tampilkanTotalStock(int[][] stock) {
        System.out.println("\nTotal Stock Setiap Cabang:");
        for (int i = 0; i < stock.length; i++) {
            int total = 0;
            for (int j = 0; j < stock[i].length; j++) {
                total += stock[i][j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": " + total + " bunga");
        }
    }

    public static void tampilkanPendapatan(int[][] stock, int[] harga) {
        System.out.println("\nPendapatan jika semua bunga terjual:");
        System.out.printf("%-15s %-15s\n", "Cabang", "Pendapatan");
        System.out.println("==============================");

        for (int i = 0; i < stock.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }
            System.out.printf("%-15s Rp %,d\n", "RoyalGarden " + (i + 1), pendapatan);
        }
    }

    public static void kurangiStockKarenaBungaMati(int[][] stock, int[] bungaMati) {
        System.out.println("\nStock Setelah Pengurangan Bunga Mati:");
        System.out.printf("%-14s %-10s %-10s %-10s %-10s\n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");
        System.out.println("======================================================");

        for (int i = 0; i < stock.length; i++) {
            System.out.printf("%-15s", "RoyalGarden " + (i + 1));
            for (int j = 0; j < stock[i].length; j++) {
                stock[i][j] += bungaMati[j]; 
                System.out.printf("%-11d", Math.max(stock[i][j], 0)); 
            }
            System.out.println();
        }
    }
}
