package Tugas4;

public class DataPerusahaan {
    public static void main(String[] args) {

        // membuat objek dari class Karyawan
        Karyawan kry = new Karyawan();

        // menggunakan setter untuk mengisi data
        kry.setNIP("2131");
        kry.setNama("Dede");
        kry.setDivisi("RPL");

        // menampilkan data menggunakan getter
        System.out.println("===== DATA KARYAWAN =====");
        System.out.println("NIP    : " + kry.getNIP());
        System.out.println("Nama   : " + kry.getNama());
        System.out.println("Divisi : " + kry.getDivisi());
    }
}
