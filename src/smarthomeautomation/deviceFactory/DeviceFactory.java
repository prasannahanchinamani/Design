package smarthomeautomation.deviceFactory;

import smarthomeautomation.devices.ControllerDevice;
import smarthomeautomation.devices.Lights;
import smarthomeautomation.devices.SecurityCameras;
import smarthomeautomation.devices.Thermostat;

public class DeviceFactory {
    public static ControllerDevice getDevice(String deviceName) {
        if (deviceName== null) {
            return null;
        }
        switch (deviceName.toLowerCase()) {
            case "Lights":
                return new Lights();
            case "Thermostat":
                return new Thermostat();
            case "SecurityCameras":
                return new SecurityCameras();
            default:
                System.out.println("Sorry, we don't have " + deviceName + "\n in this automation processo we will add it further.");
                return null;
        }
    }
}
