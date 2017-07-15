package Task1B;
public class Task1BDemo {
    public static void main(String[] args) {
        Car carA = new Car("ABC 111", "Blue", "Mitsubishi", 50.0);
        carA.accelerate();
        carA.brake();
        carA.turn();
        
        Car carB = new Car("XYZ 123", "Red", "Toyota", 100.0);
        carB.accelerate();
        carB.brake();
        carB.turn();        
    }
}
