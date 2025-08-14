package smarthomeautomation.devices;

import java.util.Scanner;

public class Lights implements ControllerDevice {
    static String status = "on";
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void TurnOn(String status) {
        if (status != null)
            System.out.println("Lights are turn on");
    }

}
