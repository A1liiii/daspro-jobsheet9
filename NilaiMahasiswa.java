import java.util.Scanner;  

public class NilaiMahasiswa {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");  
        int jumlahMahasiswa = sc.nextInt();  
        
        double[] nilaiMahasiswa = new double[jumlahMahasiswa];  

        for (int i = 0; i < jumlahMahasiswa; i++) {  
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");  
            nilaiMahasiswa[i] = sc.nextDouble();  
        }  

        double total = 0;  
        double nilaiTertinggi = nilaiMahasiswa[0];  
        double nilaiTerendah = nilaiMahasiswa[0];  

        for (double nilai : nilaiMahasiswa) {  
            total += nilai;  
            if (nilai > nilaiTertinggi) nilaiTertinggi = nilai;  
            if (nilai < nilaiTerendah) nilaiTerendah = nilai;  
        }  

        double rataRata = total / jumlahMahasiswa;  

        System.out.println("Rata-rata nilai: " + rataRata);  
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);  
        System.out.println("Nilai terendah: " + nilaiTerendah);  
        
        sc.close();  
    }  
}