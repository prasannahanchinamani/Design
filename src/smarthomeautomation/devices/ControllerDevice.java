package smarthomeautomation.devices;

import static smarthomeautomation.devices.Lights.scanner;

public interface ControllerDevice {
    void TurnOn(String status);

    default void Status() {
        System.out.println("Day/Night");
        String status = scanner.nextLine();
        if (status.equalsIgnoreCase("day"))
            System.out.println("Turn off");
    }
}
