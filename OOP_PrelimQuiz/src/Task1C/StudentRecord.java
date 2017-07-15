package Task1C;
public class StudentRecord {
    String name;
    static int count;
    StudentRecord(){
        this.name = "";
        StudentRecord.count++;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
    
    static int getStudentCount(){
        return StudentRecord.count;
    }
}
