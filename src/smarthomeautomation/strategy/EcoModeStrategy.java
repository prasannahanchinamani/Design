package smarthomeautomation.strategy;

public class EcoModeStrategy  implements  EnergySaver{
    @Override
    public void execute() {
        System.out.println("Activating Eco Mode: optimizing device power usage for maximum efficiency.");
    }
}
