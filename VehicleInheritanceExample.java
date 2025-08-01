abstract class Vehicle{
   private String vehicleNumber;
   private String vehicleType;
    static int vehicleCount=0;
    Vehicle(String vehicleNumber,String vehicleType){
        this.vehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;
        vehicleCount++;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public String getVehicleType(){
        return vehicleType;
    }
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle implements Drivable{
    private String brand;
    Car(String vehicleNumber,String vehicleType,String brand){
        super(vehicleNumber,vehicleType);
        this.brand=brand;
    }
    public String getBrandName(){
        return brand;
    }
    public void start(){
        System.out.println("Start with key!");
    }
    public void stop(){
        System.out.println("Stop with key!");
    }
    public void drive(){
        System.out.println("Car is moving");
    }
}
class Owner extends Car{
    String ownerName;
    String ownerContactNumber;
    Owner(String vehicleNumber,String vehicleType,String brand,String ownerName,String ownerContactNumber){
        super(vehicleNumber,vehicleType,brand);
        this.ownerName=ownerName;
        this.ownerContactNumber=ownerContactNumber;
    }
    public void displayDetails(){
        System.out.println("Owner Name : "+ownerName);
        System.out.println("Owner Contact : "+ownerContactNumber);
        System.out.println("Vehicle Number : "+getVehicleNumber());
        System.out.println("Vehicle Type : "+getVehicleType());
        System.out.println("Car Brand : "+getBrandName());
        System.out.println("Total no of Vehicles Created : "+vehicleCount);
    }
}
interface Drivable{
    void drive();
    static void maxSpeed(){
        System.out.println("Top Speed is 180kmph");
    }
    default void fuelType(){
        System.out.println("Petrol,Fuel,EV");
    }
}
class VehicleInheritanceExample{
    public static void main(String args[]){
        Owner o=new Owner("TN47J1917","4 Wheeler","BMW","Crista","95978*****");
        o.start();
        o.displayDetails();
        o.drive();
        Drivable.maxSpeed();
        o.fuelType();
        o.stop();
        System.out.println();
    }
}