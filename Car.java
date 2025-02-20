import java.util.Scanner;
class Car{
    String model;
    Car()
    {
        model="Unknown";
        System.out.println("Default constructor called");
    }
    String SetBrand()
    {
        model="BMW";
        return model;
    }
    void display()
    {
        System.out.println("Model:"+model);
    }
    public static void main(String args[]){
        Car c=new Car();
        c.display();
        c.SetBrand();
        c.display();
    }
}