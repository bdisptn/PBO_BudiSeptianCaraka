package JobsheetW07.Tugas;

public class Sop extends Makanan {
    private int sosis;
    private int sayur;

    public Sop() {
        super();
        this.sosis = 0;
        this.sayur = 0;
    }

    public Sop(int garam, int gula, int air, int sosis, int sayur) {
        super(garam, gula, air);
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
