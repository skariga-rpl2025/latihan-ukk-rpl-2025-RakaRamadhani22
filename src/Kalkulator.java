
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        double angka1, angka2, hasil;
        
        System.out.println("===> KALKULATOR SEDERHANA <===");
        System.out.println("Pilih Operasi : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("\nMasukan Pilihan (1-4) : ");
        pilihan =  input.nextInt();
        
        System.out.println("Masukan Angka Pertama: ");
        angka1 = input.nextDouble();
        System.out.println("Masukan Angka Kedua: ");
        angka2 = input.nextDouble();
        
        switch(pilihan){
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil Penguragan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian: " + hasil);
                break;
            case 4:
                if (angka2 == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                } else {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil Pembagian: " + hasil);
                }
                break;
            default:
                System.out.println("Pilihan tidak valid! Silakan pilih angka 1–4.");    
        }
    }
}
