import java.util.Scanner;  

public class SearchNilai15 {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");  
        int jumlahMahasiswa = sc.nextInt();  
        
        int[] nilaiMhs = new int[jumlahMahasiswa];  
        
        for (int i = 0; i < jumlahMahasiswa; i++) {  
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");  
            nilaiMhs[i] = sc.nextInt();  
        }  

        System.out.print("Masukkan nilai yang ingin dicari: ");  
        int key = sc.nextInt();  
        int indeks = -1;  

        for (int i = 0; i < nilaiMhs.length; i++) {  
            if (nilaiMhs[i] == key) {  
                indeks = i;  
                break;  
            }  
        }  

        if (indeks != -1) {  
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (indeks + 1));  
        } else {  
            System.out.println("Nilai yang dicari tidak ditemukan");  
        }  

        sc.close();  
    }  
}