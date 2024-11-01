import java.util.Scanner;  

public class PesananKafe {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  

        System.out.print("Masukkan jumlah pesanan: ");  
        int jumlahPesanan = sc.nextInt();  
        sc.nextLine();  

        String[] namaPesanan = new String[jumlahPesanan];  
        double[] hargaPesanan = new double[jumlahPesanan];  

        for (int i = 0; i < jumlahPesanan; i++) {  
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");  
            namaPesanan[i] = sc.nextLine();  
            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");  
            hargaPesanan[i] = sc.nextDouble();  
            sc.nextLine(); 
        }  

        double totalBiaya = 0;  
        for (double harga : hargaPesanan) {  
            totalBiaya += harga;  
        }  

        System.out.println("Total biaya dari pesanan yang telah dimasukkan: " + totalBiaya);  
        
        sc.close();  
    }  
}