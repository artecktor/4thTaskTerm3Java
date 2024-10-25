public class Run {

    public static void main(String[] args) {
        ApplianceController applianceController = new ApplianceController();

        SmartFan smartFan = new SmartFan();
        SmartHeater smartHeater = new SmartHeater();
        SmartLight smartLight = new SmartLight();

        applianceController.smartAppliances.add(smartFan);
        applianceController.smartAppliances.add(smartHeater);
        applianceController.smartAppliances.add(smartLight);
    }
}
