abstract public class SmartAppliance {
    String name;
    boolean isOn;

    abstract void performAction();

    void turnOn() {
        isOn = true;
        System.out.println("the machine is on");
    }

    void turnOff() {
        isOn = false;
        System.out.println("the machine is off");
    }
}
