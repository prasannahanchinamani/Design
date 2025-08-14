package smarthomeautomation.strategy;

public class NightModeStrategy implements  EnergySaver {
    @Override
    public void execute() {
        System.out.println("Activating Night Mode: dimming lights, lowering thermostat, turning off unused devices.");
    }
}
