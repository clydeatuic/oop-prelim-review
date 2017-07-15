package Task1A;
public class Car {
    String transmission;
    String manufacturer;
    String color;
    Car(String transmission, String manufacturer, String color){
        this.transmission = transmission;
        this.manufacturer = manufacturer;
        this.color = color;
        System.out.println("New Car has been created.");
    }
    void turning(){
        System.out.println("Car is turning.");
    }
    void braking(){
        System.out.println("Car is braking.");
    }
    void accelerating(){
        System.out.println("Car is accelerating.");
    }    
}
