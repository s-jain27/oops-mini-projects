// Abstract class for common device attributes and methods
abstract class SmartDevice {
    String deviceName;
    boolean status;  
    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.status = false; // All devices start off by default 
    }
    abstract void turnOn();
    abstract void turnOff();
  
    abstract void scheduleAutomation();
}
// Interface 
interface BatteryPowered {
    void BatteryLevel();
}
// Light device subclass
class Light extends SmartDevice  {
    
    public Light(String deviceName) { // constructor
        super(deviceName); 
    }
    // Override 
    @Override
    void turnOn() {
        status = true;
        System.out.println(deviceName + " is turned ON");
    }
    @Override
    void turnOff() {
        status = false;
        System.out.println(deviceName + " is turned OFF");
    }
    @Override
    void scheduleAutomation() {
        System.out.println("Lights will be turned ON when motion is detected.");
    }
}
// Thermostat device subclass
class Thermostat extends SmartDevice {
    
    public Thermostat(String deviceName) {
        super(deviceName);  // constructor
    }
    // Override 
    @Override
    void turnOn() {
        status = true;
        System.out.println(deviceName + " is turned ON");
    }
    @Override
    void turnOff() {
        status = false;
        System.out.println(deviceName + " is turned OFF");
    }
    @Override
    void scheduleAutomation() {
        System.out.println("Thermostat will be turned off during afternoon.");
    }
}
// SecurityCamera subclass
class SecurityCamera extends SmartDevice implements BatteryPowered {
    
    public SecurityCamera(String deviceName) {
        super(deviceName);  //constructor
    }
    // Override 
    @Override
    void turnOn() {
        status = true;
        System.out.println(deviceName + " is turned ON.");
    }
    @Override
    void turnOff() {
        status = false;
        System.out.println(deviceName + " is turned OFF");
    }
    @Override
    void scheduleAutomation() {
        System.out.println(deviceName + " will automatically record audio also.");
    }
    // interface usage
    @Override
    public void BatteryLevel() {
        System.out.println(deviceName + " battery level is 50%");
    }
}
public class SmartHomeAutomation {
    public static void main(String[] args) {
        // Creating instances of devices
        SmartDevice light = new Light("LED light");
        SmartDevice thermostat = new Thermostat("thermostat 12");
        SmartDevice camera = new SecurityCamera("cctv-545");      
        // achieving polymorphism
        light.turnOn();
        camera.scheduleAutomation();
        thermostat.turnOff();
    }  
}
