abstract class SmartDevice{
    private String deviceName;
    SmartDevice(String deviceName){
        this.deviceName=deviceName;
    }
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	abstract void performFunction();
}
class Light extends SmartDevice{
	int brightnessLevel;
    public Light(String deviceName){
        super(deviceName);
        this.brightnessLevel=brightnessLevel;
    }
	public void setBrightnessLevel(int level) {
		this.brightnessLevel =level;
	}
	public void performFunction() {
		System.out.println(getDeviceName()+" adjusting Brightness Level is "+brightnessLevel+"%");
	}
}
class Thermosat extends SmartDevice {
	double temperature;
	Thermosat(String deviceName) {
	super(deviceName);
	this.temperature=temperature;
}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temp) {
		this.temperature = temp;
	}
	public void performFunction() {
	System.out.println(getDeviceName()+" temperature Level is "+temperature+"°C");
}
}
class Room {
    String roomName;
    SmartDevice device1;
	SmartDevice device2;
	Room(String roomName,SmartDevice device1,SmartDevice device2){
		this.roomName=roomName;
		this.device1=device1;
		this.device2=device2;
	}
	public void showroomDetails() {
		System.out.println("Room : "+roomName);
		System.out.println("Device 1 : "+device1.getDeviceName());
		System.out.println("Device 2 : "+device2.getDeviceName());
	}
	public void controlDevices() {
		device1.performFunction();
		device2.performFunction();
	}
}
class House {
	 Room room1;
	 Room room2;
	 House(Room room1,Room room2){
		 this.room1=room1;
		 this.room2=room2;
	 }
	 public void showAllDevices() {
		 room1.showroomDetails();
		 room2.showroomDetails();
	 }
	 public void controlAllDevices() {
		 room1.controlDevices();
		 room2.controlDevices();
	 }
}
class SmartDeviceRoom{
	public static void main(String[] args) {
		Light livRoomLight=new Light("Living Room Light");
		Thermosat livRoomThermo=new Thermosat("Living Room Thermosat");
		livRoomLight.setBrightnessLevel(75);
		livRoomThermo.setTemperature(22.5);
		Room livingRoom=new Room("Living Room", livRoomLight, livRoomThermo);
		Light bedLight=new Light("Bed Room Light");
		Thermosat bedThermo=new Thermosat("Bed Room Thermosat");
		bedLight.setBrightnessLevel(60);
		bedThermo.setTemperature(25.0);
		Room bedRoom=new Room("Bed Room",bedLight,bedThermo);
		House allRoom=new House(livingRoom,bedRoom);
		allRoom.showAllDevices();
		allRoom.controlAllDevices();
	}

}
