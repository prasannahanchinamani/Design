package smarthomeautomation.devices;

public class Thermostat implements ControllerDevice {
    String status = "On";

    @Override
    public void TurnOn(String status) {
        System.out.println("Thermostat installed wait for Boot..");
        System.out.println("Welcome The Info is Displayed");
    }


}
