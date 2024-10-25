public class SmartFan extends SmartAppliance implements Adjustable {
    int speed = 0;

    @Override
    void performAction() {
        if (isOn) {
            System.out.println("the fan is spinning");
        }
    }


    @Override
    public void increaseSetting() {
        if (speed < 5) {
            speed++;
        }
        System.out.println("The speed is " + speed);
    }

    @Override
    public void decreaseSetting() {
        if (speed < 0) {
            speed--;
        }
        System.out.println("The speed is " + speed);
    }

    @Override
    public String toString() {
        return "SmartFan{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
