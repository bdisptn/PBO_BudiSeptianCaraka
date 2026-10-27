package JobsheetW07.Tugas;

public class Sop extends Makanan {
    public int sosis;
    public int sayur;

    public Sop() {
        super();
    }

    public Sop(int asin, int manis, int cair, int sosis, int sayur) {
        super(asin, manis, cair);
        this.sosis = sosis;
        this.sayur = sayur;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Sosis: " + this.sosis + " gram");
        System.out.println("Sayur : " + this.sayur + " gram");
    }
    
}
