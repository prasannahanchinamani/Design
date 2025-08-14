package smarthomeautomation;

import smarthomeautomation.devices.Lights;
import smarthomeautomation.strategy.CentralController;
import smarthomeautomation.strategy.DayModeStrategy;
import smarthomeautomation.strategy.EcoModeStrategy;
import smarthomeautomation.strategy.EnergySaver;
import smarthomeautomation.strategy.NightModeStrategy;
import smarthomeautomation.observer.Scene;
import smarthomeautomation.observer.DevicesUpdate;

public class MainAutomation {
    public static void main(String[] args) {

        CentralController controller = CentralController.getInstance();
        controller.initializeSystem();

//        Scene morningScene = new Scene();
        SupportMenu.start();


    }
}
