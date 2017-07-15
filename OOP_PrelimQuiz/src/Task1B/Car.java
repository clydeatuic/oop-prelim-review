package Task1B;
public class Car {
    String plateNumber;
    String color;
    String manufacturer;
    double currentSpeedInKM;
    Car(String plateNumber, String color, String manufacturer, double currentSpeed){
        this.plateNumber = plateNumber;
        this.color = color;
        this.manufacturer = manufacturer;
        this.currentSpeedInKM = currentSpeedInKM;
        System.out.println("New car has been created.");
    }
    void accelerate(){
        System.out.println("accelerating...");
    }
    void brake(){
        System.out.println("brake has been applied...");
    }
    void turn(){
        System.out.println("turning...");
    }
    
    
}
