// The following class is the program's backbone.
public class Device {
    private String deviceName;
    private double powerConsumption;

    // Setters
    public Device(String deviceName, double powerConsumption) {
        this.deviceName = deviceName;
        this.powerConsumption = powerConsumption;
    }

    // Getters
    public String getdeviceName() {
        return deviceName;
    }
    public double getpowerCons() {
        return powerConsumption;
    }
}
