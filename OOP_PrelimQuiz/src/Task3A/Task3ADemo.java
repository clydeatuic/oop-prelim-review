package Task3A;
public class Task3ADemo {
    public static void main(String[] args) {        
        Employee sarah = new VicePresident();
        sarah.setName("Sarah");
        System.out.println("Employees name is " + sarah.getName());
        
        Employee mark = new Janitor();
        mark.setName("Mark");
        System.out.println("Employees name is " + mark.getName());
        
    }
}
