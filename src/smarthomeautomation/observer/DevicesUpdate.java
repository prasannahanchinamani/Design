package smarthomeautomation.observer;

import smarthomeautomation.devices.ControllerDevice;

public interface DevicesUpdate {

    void addDevice(String device);

    void removeDevice(String device);

    void notifyDevices();

    void update(String sceneName);
}

