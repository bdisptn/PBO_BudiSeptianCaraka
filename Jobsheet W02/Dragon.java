public class Dragon{
    int x;
    int y;
    int direction;

    public Dragon(){
        this.x = 0;
        this.y = 0;
        this.direction = 1; 
    }

    public void changeDirection(int newDirection){
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } 
    }

    public void move(int steps){
        switch (direction) {
            case 1:
                y += steps;
                break;
            case 2: 
                x += steps;
                break;
            case 3: 
                y -= steps;
                break;
            case 4:
                x -= steps;
                break;
        }
    }

    public void printStatus(){
        String namaArah = null;
        switch (direction) {
            case 1:
                namaArah = "Atas";
                break;
            case 2:
                namaArah = "Kanan";
                break;
            case 3:
                namaArah = "Bawah";
                break;
            case 4:
                namaArah = "Kiri";
                break;
        }
        System.out.println("Dragon berada di (" + x + ", " + y + ") dengan arah " + direction + " yaitu " + namaArah);
    }
}