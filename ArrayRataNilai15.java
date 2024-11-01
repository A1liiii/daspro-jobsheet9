import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int totalLulus = 0, totalTidakLulus = 0;
        int countLulus = 0, countTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();

            if (nilaiMahasiswa[i] >= 70) {
                totalLulus += nilaiMahasiswa[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMahasiswa[i];
                countTidakLulus++;
            }
        }
        System.out.println("Jumlah mahasiswa yang lulus :"+countLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus :"+countTidakLulus);

        double rataLulus = (countLulus > 0) ? (double) totalLulus / countLulus : 0.0;
        double rataTidakLulus = (countTidakLulus > 0) ? (double) totalTidakLulus / countTidakLulus : 0.0;

        System.out.printf("Rata-rata nilai lulus = %.1f%n", rataLulus);
        System.out.printf("Rata-rata nilai tidak lulus = %.1f%n", rataTidakLulus);
    }
}
