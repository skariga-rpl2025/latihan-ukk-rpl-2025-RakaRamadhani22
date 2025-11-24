package Tugas2;

import java.util.Scanner;

public class VotingKetos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int suaraA = 0;
        int suaraB = 0;
        String pilihan;

        System.out.println("====> PROGRAM VOTING KETUA OSIS <====");
        System.out.println("Masukkan Suara Untuk Kandidat A atau B");
        System.out.println("Ketik 'selesai' Untuk Mengakhiri\n");

        while (true) {
            System.out.print("Masukkan pilihan Anda (A/B): ");
            pilihan = input.nextLine().trim().toLowerCase();

            if (pilihan.equals("selesai")) {
                break;
            }

            if (pilihan.equals("a")) {
                suaraA++;
            } else if (pilihan.equals("b")) {
                suaraB++;
            } else {
                System.out.println("Input tidak valid! Masukkan hanya A, B, atau 'selesai'.");
            }
        }

        System.out.println("\n====> HASIL PEROLEHAN SUARA <====");
        System.out.println("Total Suara Kandidat A: " + suaraA);
        System.out.println("Total Suara Kandidat B: " + suaraB);
    }
}
