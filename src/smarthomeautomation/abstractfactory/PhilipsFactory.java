package smarthomeautomation.abstractfactory;

import smarthomeautomation.devices.ControllerDevice;
import smarthomeautomation.devices.Lights;
import smarthomeautomation.devices.SecurityCameras;
import smarthomeautomation.devices.Thermostat;

public class PhilipsFactory implements DeviceFactory {
    @Override
    public ControllerDevice Brand(String brandName) {
        if (brandName == null)
            return null;
        System.out.println("BrandName:" + brandName + ":");
        switch (brandName.toLowerCase()) {
            case "Lights":
                return new Lights();
            case "Thermostat":
                return new Thermostat();
            case "SecurityCameras":
                return new SecurityCameras();
            default:
                System.out.println("Sorry, we don't have " + brandName + "\n if you Want We will Get That:");
                return null;

        }
    }
}
