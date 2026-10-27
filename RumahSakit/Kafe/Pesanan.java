package RumahSakit.Kafe;
import java.util.ArrayList;

public class Pesanan {
    private String idPesanan;
    private boolean statusPembayaran;
    private ArrayList<Menu> daftarMenu;

    public Pesanan(String idPesanan, boolean statusPembayaran) {
        this.idPesanan = idPesanan;
        this.statusPembayaran = statusPembayaran;
        this.daftarMenu = new ArrayList<Menu>();
    }

    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(boolean statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public double hitungTotal() {
        double totalHarga = 0;
        for (Menu menu : daftarMenu) {
            totalHarga += menu.getHarga();
        }
        return totalHarga;
    }

    public void bayarPesanan() {
        this.statusPembayaran = true;
    }

    public void getInfoPesanan() {
       System.out.println("\tID Pesanan       : " + idPesanan);
        System.out.println("\tStatus Pembayaran: " + (statusPembayaran ? "Lunas" : "Belum Lunas"));
        System.out.println("\tDaftar Menu:");
        if (!daftarMenu.isEmpty()) {
            for (Menu menu : daftarMenu) {
                System.out.println("\t\t- " + menu.getNamaMenu() + " (Harga: " + menu.getHarga() + ")");
            }
        } else {
            System.out.println("Belum ada menu yang dipesan");
        }
        System.out.println("\tTotal Harga      : " + hitungTotal());
    }
}
