package smarthomeautomation.strategy;

public class DayModeStrategy implements  EnergySaver {
    @Override
    public void execute() {
        System.out.println("Activating Morning  Mode: turn off lights, lowering thermostat, turning off unused devices.");
    }
}
