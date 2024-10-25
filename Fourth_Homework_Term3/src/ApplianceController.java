import java.util.ArrayList;

public class ApplianceController {
    SmartFan smartFan = new SmartFan();
    SmartHeater smartHeater = new SmartHeater();
    SmartLight smartLight = new SmartLight();
    ArrayList<SmartAppliance> smartAppliances = new ArrayList<>();

    public void main(String[] args) {
        smartAppliances.add(smartFan);
        smartAppliances.add(smartHeater);
        smartAppliances.add(smartLight);
    }

    void addAppliance(SmartAppliance appliance) {
        smartAppliances.add(appliance);
    }

    void performAllActions() {
        for (SmartAppliance smartAppliance : smartAppliances) {
            smartAppliance.performAction();
        }
    }

    void showStatus() {
        System.out.println(smartAppliances);
    }
}
