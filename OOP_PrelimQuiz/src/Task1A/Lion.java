package Task1A;
public class Lion {
    double weight;
    String color;
    boolean isHungry;
    String type;
    Lion(double weight, String color, boolean isHungry, String type){
        this.weight = weight;
        this.color = color;
        this.isHungry = isHungry;
        this.type = type;
        System.out.println("New Lion has been created.");
    }
    void roaring(){
        System.out.println("The Lion roars...");
    }
    void sleeping(){
        System.out.println("The Lion sleeps...");
    }
    void hunting(){
        System.out.println("The Lion hunts...");
    }
}
