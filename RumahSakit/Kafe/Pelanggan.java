package RumahSakit.Kafe;
import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private int poinMember;
    private ArrayList<Pesanan> riwayatPesanan;

    public Pelanggan(String nama, int poinMember) {
        this.nama = nama;
        this.poinMember = poinMember;
        this.riwayatPesanan = new ArrayList<Pesanan>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPoinMember() {
        return poinMember;
    }

    public void setPoinMember(int poinMember) {
        this.poinMember = poinMember;
    }

    public void buatPesanan(Pesanan pesanan) {
        this.riwayatPesanan.add(pesanan);
    }

    public void tambahPoin(int poin) {
        this.poinMember += poin;
    }

    public void getInfoPelanggan() {
        System.out.println("Nama Pelanggan  : " + nama);
        System.out.println("Poin Member     : " + poinMember);
        System.out.println("Riwayat Pesanan :");
        if (!riwayatPesanan.isEmpty()) {
            for (Pesanan pesanan : riwayatPesanan) {
                System.out.print(pesanan.getInfoPesanan());
            }
        } else {
            System.out.println("Belum ada riwayat pesanan");
        }
        System.out.println();
    }
}

