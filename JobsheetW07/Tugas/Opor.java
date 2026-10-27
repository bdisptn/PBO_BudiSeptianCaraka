package JobsheetW07.Tugas;

public class Opor extends Makanan {
    public int santan;
    public int ayam;

    public Opor() {
        
    }

    public Opor(int garam, int gula, int air, int santan, int ayam) {
        super(garam, gula, air);
        this.santan = santan;
        this.ayam = ayam;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Santan: " + this.santan + " ml");
        System.out.println("Ayam  : " + this.ayam + " gram");
    }
    
}
