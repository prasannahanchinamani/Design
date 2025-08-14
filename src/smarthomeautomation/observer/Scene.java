package smarthomeautomation.observer;

import smarthomeautomation.devices.ControllerDevice;
import java.util.ArrayList;
import java.util.List;

public class Scene {
    private List<ControllerDevice> devices = new ArrayList<>();
    private String sceneName;

    public void addDevice(ControllerDevice device) {
        devices.add(device);
    }

    public void removeDevice(ControllerDevice device) {
        devices.remove(device);
    }

    public void notifyDevices() {
        for (ControllerDevice device : devices) {
            device.Status();
        }
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
        System.out.println("Scene changed to: " + sceneName);
        notifyDevices();
    }
}
