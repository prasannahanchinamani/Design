package smarthomeautomation.strategy;

//package smarthomeautomation.singleton;

public class CentralController {
    private static CentralController instance;

    private CentralController() {
    }


    public static CentralController getInstance() {
        if (instance == null) {
            instance = new CentralController();
        }
        return instance;
    }

    public void initializeSystem() {
        System.out.println("Smart Home Central Controller is now running...");
    }

    public void shutdownSystem() {
        System.out.println("Shutting down Smart Home Central Controller...");
    }
}
