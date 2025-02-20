import java.util.Scanner;
class Counter{
    static int count=0;
    Counter()
    {
        count++;
    }
    void display(){
    System.out.println("Object created! Current object:"+count);
    }
public static void main(String args[]){
    Counter c=new Counter();
    c.display();
    Counter d=new Counter();
    d.display();
    Counter e=new Counter();
    e.display();
}
}