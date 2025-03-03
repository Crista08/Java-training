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
    class Dept extends Student{
        public int dept_id=104;
        public void disp(){
            System.out.println("Department id : "+dept_id);
        }
    }
public class Multilevel_inheritance{
    public static void main(String args[]){
        Dept b=new Dept();
        b.get();
        b.display();
        b.disp();
    }
}
        