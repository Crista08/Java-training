import java.util.*;
class College{
    public int id=720722104;
    public void get(){
        System.out.println("College id : "+id);
    }
}
    class Student extends College{
        public int student_id=4080;
        public void display(){
            System.out.println("Student id : "+student_id);
        }
    }
public class Single_inheritance{
    public static void main(String args[]){
        Student b=new Student();
        b.get();
        b.display();
    }
}
        