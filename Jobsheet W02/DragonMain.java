public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.move(1);
        dragon.printStatus();

        dragon.move(5);
        dragon.printStatus();

        dragon.changeDirection(2);
        dragon.move(3);
        dragon.printStatus();

        dragon.changeDirection(3);
        dragon.move(2);
        dragon.printStatus();

        Dragon dragon2 = new Dragon();
        dragon2.move(3);
        dragon2.printStatus();

        dragon2.move(4);
        dragon2.printStatus();

        dragon2.changeDirection(3);
        dragon2.move(6);    
        dragon2.printStatus();  

        dragon2.changeDirection(5); // arah/direction yang salah
        dragon2.move(2);
        dragon2.printStatus();
        
    }
}
