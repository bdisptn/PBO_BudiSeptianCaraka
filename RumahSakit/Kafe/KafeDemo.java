package RumahSakit.Kafe;

public class KafeDemo {
    public static void main(String[] args) {
        // Membuat objek Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Budi", 100);
        Pelanggan pelanggan2 = new Pelanggan("Siti", 50);

        // Membuat objek Menu
        Menu menu1 = new Menu("Nasi Goreng", 15000);
        Menu menu2 = new Menu("Mie Ayam", 12000);
        Menu menu3 = new Menu("Es Teh", 3000);
        Menu menu4 = new Menu("Kopi", 4000);

        // Membuat objek Pesanan
        Pesanan pesanan1 = new Pesanan("P001", true);
        pesanan1.tambahMenu(menu1);
        pesanan1.tambahMenu(menu2);

        Pesanan pesanan2 = new Pesanan("P002", false);
        pesanan2.tambahMenu(menu2);
        pesanan2.tambahMenu(menu3);
        pesanan2.tambahMenu(menu4);

        // Menambahkan pesanan ke riwayat pelanggan
        pelanggan1.buatPesanan(pesanan1);
        pelanggan2.buatPesanan(pesanan2);

        // Menampilkan informasi pelanggan dan riwayat pesanan
        System.out.println("Informasi Pelanggan 1:");
        pelanggan1.getInfoPelanggan();
        
        System.out.println("\nInformasi Pelanggan 2:");
        pelanggan2.getInfoPelanggan();
    }
}
