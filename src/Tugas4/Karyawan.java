package Tugas4;

class Karyawan {
    
    private String NIP;
    private String nama;
    private String divisi;

    
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getDivisi() {
        return divisi;
    }

}
