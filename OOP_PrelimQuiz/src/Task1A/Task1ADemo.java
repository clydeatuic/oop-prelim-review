package Task1A;
public class Task1ADemo {
    public static void main(String[] args) {
        Car benz = new Car("Manual", "Mercedez", "White");
        benz.turning();
        benz.braking();
        benz.accelerating();
        
        Car prius = new Car("Automatic", "Toyota", "Red");
        prius.turning();
        prius.braking();
        prius.accelerating();
        
        Car jetta = new Car("Semi-automatic", "Volkswagen", "Blue");
        jetta.turning();
        jetta.braking();
        jetta.accelerating();    
        
        Lion simba = new Lion(10.5, "light orange", false, "tamed");
        simba.roaring();
        simba.sleeping();
        simba.hunting();
        
        Lion mufasa = new Lion(25.5, "dark orange", true, "wild");
        mufasa.roaring();
        mufasa.sleeping();
        mufasa.hunting();
        
        Lion nala = new Lion(22.2, "brown", false, "tamed");
        nala.roaring();
        nala.sleeping();
        nala.hunting();        
        
    }
}
