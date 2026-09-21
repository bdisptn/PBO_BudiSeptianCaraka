package RumahSakit.Kafe;

public class Menu {
    private String namaMenu;
    private double harga;

    public Menu(String namaMenu, double harga) {
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void getInfoMenu() {
        System.out.println("Nama Menu: " + namaMenu);
        System.out.println("Harga: " + harga);
    }
}
