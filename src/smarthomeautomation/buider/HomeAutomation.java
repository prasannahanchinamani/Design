package smarthomeautomation.buider;

// Product
class Automation {
    private boolean lights;
    private boolean securityCamera;
    private String thermostat;

    public Automation(boolean lights, boolean securityCamera, String thermostat) {
        this.lights = lights;
        this.securityCamera = securityCamera;
        this.thermostat = thermostat;
    }

    public void showScene() {
        System.out.println("Lights: " + (lights ? "On" : "Off"));
        System.out.println("Security Camera: " + (securityCamera ? "On" : "Off"));
        System.out.println("Thermostat: " + thermostat);
    }
}

// Builder
public class HomeAutomation {
    private boolean lights;
    private boolean securityCamera;
    private String thermostat;

    public HomeAutomation setLights(boolean lights) {
        this.lights = lights;
        return this;
    }

    public HomeAutomation setSecurityCamera(boolean securityCamera) {
        this.securityCamera = securityCamera;
        return this;
    }

    public HomeAutomation setThermostat(String thermostat) {
        this.thermostat = thermostat;
        return this;
    }

    public Automation build() {
        return new Automation(lights, securityCamera, thermostat);
    }

    // Predefined routine: Morning
    public static Automation buildMorningRoutine() {
        return new HomeAutomation()
                .setLights(true)
                .setSecurityCamera(true)
                .setThermostat("22°C")
                .build();
    }

    // Predefined routine: Night
    public static Automation buildNightMode() {
        return new HomeAutomation()
                .setLights(false)
                .setSecurityCamera(true)
                .setThermostat("18°C")
                .build();
    }
}
