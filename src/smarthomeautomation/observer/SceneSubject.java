package smarthomeautomation.observer;

public interface SceneSubject {
    void addDevice(DevicesUpdate device);

    void removeDevice(DevicesUpdate device);

    void notifyDevices();
}
