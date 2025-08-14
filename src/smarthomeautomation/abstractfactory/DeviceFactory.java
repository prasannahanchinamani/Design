package smarthomeautomation.abstractfactory;

import smarthomeautomation.devices.ControllerDevice;

public interface DeviceFactory {
    ControllerDevice Brand(String brandName);

}
