public class SmartLight extends SmartAppliance {
    int brightness;

    @Override
    void performAction() {
        if (isOn) {
            System.out.println("The room should be lit");
        }
    }

    @Override
    public String toString() {
        return "SmartLight{" +
                "brightness=" + brightness +
                ", name='" + name + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
