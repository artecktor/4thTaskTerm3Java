public class SmartHeater extends SmartAppliance implements Adjustable {
    double temperature = 20.0d;
    @Override
    void performAction() {
        if (isOn){
            System.out.println("The heater is heating up the room");
        }
    }

    @Override
    public void increaseSetting() {
        temperature += 2.0d;
    }

    @Override
    public void decreaseSetting() {
        temperature -= 2.0d;
    }

    @Override
    public String toString() {
        return "SmartHeater{" +
                "temperature=" + temperature +
                ", name='" + name + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
