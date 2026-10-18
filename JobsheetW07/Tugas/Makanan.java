package JobsheetW07.Tugas;

public class Makanan {
    public int garam;
    public int gula;
    public int air;

    public Makanan() {

    }

    public Makanan(int garam, int gula, int air) {
        this.garam = garam;
        this.gula = gula;
        this.air = air;
    }

    public void tampilkanInfo() {
        System.out.println("Garam : " + this.garam + " gram");
        System.out.println("Gula  : " + this.gula + " gram");
        System.out.println("Air   : " + this.air + " ml");
    }
}
