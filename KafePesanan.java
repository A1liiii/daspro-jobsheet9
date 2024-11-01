import java.util.Scanner;  

public class KafePesanan {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};  

        System.out.println("Menu Makanan di Kafe:");  
        for (int i = 0; i < menu.length; i++) {  
            System.out.println((i + 1) + ". " + menu[i]);  
        }  

        System.out.print("Masukkan nama makanan yang ingin dicari: ");  
        String makananDicari = sc.nextLine();  

        boolean ditemukan = false;  
        for (int i = 0; i < menu.length; i++) {  
            if (menu[i].equalsIgnoreCase(makananDicari)) {  
                System.out.println(makananDicari + " terdapat dalam menu.");  
                ditemukan = true;  
                break;  
            }  
        }  

        if (!ditemukan) {  
            System.out.println(makananDicari + " tidak ada di menu.");  
        }  

        sc.close();  
    }  
}