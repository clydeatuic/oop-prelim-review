package Task3A;
public class Employee {
    String name;
    
    Employee(){
        System.out.println("Constructor of Employee has been loaded.");
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}

class VicePresident extends Employee{
    
    VicePresident(){
        System.out.println("Constructor of VicePresident has been loaded.");        
    }
    
    @Override
    void setName(String name){
        this.name = "VP " + name.toUpperCase();
    }
}

class Janitor extends Employee{
    
    Janitor(){
        System.out.println("Constructor of Janitor has been loaded.");
    }
    
    @Override
    void setName(String name){
        this.name = "Mr. " + name;
    }
}
