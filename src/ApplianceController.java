import java.util.ArrayList;

public class ApplianceController {
    ArrayList<SmartAppliance> smartAppliances = new ArrayList<>();

    void addAppliance(SmartAppliance appliance) {
        smartAppliances.add(appliance);
    }

    void performAllActions() {
        for (SmartAppliance smartAppliance : smartAppliances){
            smartAppliance.performAction();
        }
    }

    void showStatus() {
        System.out.println(smartAppliances);
    }
}
