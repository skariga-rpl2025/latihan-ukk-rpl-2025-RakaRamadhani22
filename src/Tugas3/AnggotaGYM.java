package Tugas3;

import java.util.Scanner;

public class AnggotaGYM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalAnggota = 0;
        String nama;
        String jawaban;

        System.out.println("====> PENDAFTARAN ANGGOTA GYM <====");

        do {
            System.out.print("\nMasukkan Nama Anggota: ");
            nama = input.nextLine();
            totalAnggota++;

            System.out.print("Daftar Anggota Lagi? [ya/tidak] ");
            jawaban = input.nextLine().trim().toLowerCase();

        } while (jawaban.equals("ya"));

        System.out.println("\n----------------------------------");
        System.out.println("Total Anggota Yang Didaftarkan: " + totalAnggota);

    }
}
