package JobsheetW07.Tugas;

public class MakananDemo {
    public static void main(String[] args) {
        Opor opor = new Opor(5, 10, 200, 100, 500);
        Sop sop = new Sop(3, 8, 150, 200, 300);

        System.out.println("Informasi Opor:");
        opor.tampilkanInfo();

        System.out.println("\nInformasi Sop:");
        sop.tampilkanInfo();
    }
}
