package smarthomeautomation.devices;

public class SecurityCameras implements ControllerDevice {
    String status = "On";

    @Override
    public void TurnOn(String status) {
        System.out.println("Cameras can work In Dark also ");
        System.out.println("Camera are High Resolution...");
    }


}
