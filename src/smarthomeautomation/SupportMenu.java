package smarthomeautomation;

import smarthomeautomation.devices.ControllerDevice;
import smarthomeautomation.devices.Lights;
import smarthomeautomation.devices.SecurityCameras;
import smarthomeautomation.devices.Thermostat;
import smarthomeautomation.observer.Scene;
import smarthomeautomation.strategy.DayModeStrategy;
import smarthomeautomation.strategy.EcoModeStrategy;
import smarthomeautomation.strategy.EnergySaver;
import smarthomeautomation.strategy.NightModeStrategy;

import java.util.Scanner;

public class SupportMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scene scene = new Scene(); // persistent observer
    private static EnergySaver energySaver;

    public static void start() {
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1) Select Device & Control");
            System.out.println("2) Change Scene");
            System.out.println("3) Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> AutomationMenu();
                case 2 -> changeSceneMenu();
                case 3 -> {
                    System.out.println("Exiting... Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void AutomationMenu() {
        System.out.println("\nSelect a Device:");
        System.out.println("1) Lights");
        System.out.println("2) Security Camera");
        System.out.println("3) Thermostat");
        System.out.print("Choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        ControllerDevice device;
        switch (choice) {
            case 1 -> device = new Lights();
            case 2 -> device = new SecurityCameras();
            case 3 -> device = new Thermostat();
            default -> {
                System.out.println("Invalid choice.");
                return;
            }
        }

        // Register the device with the scene
        scene.addDevice(device);

        // Call full control workflow
        DeviceControl(device);
    }

    // New DeviceControl method
    private static void DeviceControl(ControllerDevice device) {
        // 1) Pick energy mode
        SaverMenu();

        // 2) Turn on device
        if (energySaver == null) {
            System.out.print("Enter custom status: ");
            String status = scanner.nextLine();
            device.TurnOn(status);
        } else {
            energySaver.execute(); // runs strategy
            device.TurnOn("on");   // assume "on" when strategy executes
        }

        // 3) Show device status
        device.Status();

        // 4) Notify devices in scene
        System.out.println("\nNotifying all devices in the current scene...");
        scene.notifyDevices();
    }

    private static void SaverMenu() {
        System.out.println("\nEnergy Saving Modes:");
        System.out.println("1) Day Mode");
        System.out.println("2) Eco Mode");
        System.out.println("3) Night Mode");
        System.out.println("4) Cancel Mode");
        System.out.print("Choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> energySaver = new DayModeStrategy();
            case 2 -> energySaver = new EcoModeStrategy();
            case 3 -> energySaver = new NightModeStrategy();
            case 4 -> energySaver = null;
            default -> System.out.println("Invalid choice.");
        }
    }

    private static void changeSceneMenu() {
        System.out.print("Enter new scene name: ");
        String sceneName = scanner.nextLine();
        scene.setSceneName(sceneName);
    }
}
