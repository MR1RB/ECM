/* In this Project I am going to demonstrate
an Energy Consumption Manager that would calculate
the total power from a set of devices (for this example
it is going to be a mini Solar Plant), and I will keep
adding features as I learn more Java Programming */

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] _args) {
        // Declarations
        String deviceName = "";
        double powerConsumption;
        Scanner scanner = new Scanner(System.in);
        double threshold = 0;
        ArrayList<String> deviceNames = new ArrayList<>();
        ArrayList<Double> powerConsumptions = new ArrayList<>();


        System.out.println("Type 'done' at device name to exit program");
            while (!deviceName.contentEquals("done")) {
                System.out.println("Enter device name: ");
                deviceName = scanner.nextLine();
                if (deviceName.contentEquals("done")) {break;}
                System.out.println("Enter power consumption: ");
                powerConsumption = scanner.nextDouble();
                Device Inverter = new Device(deviceName, powerConsumption);
                deviceNames.add(Inverter.getdeviceName());
                powerConsumptions.add(Inverter.getpowerCons());
                if(deviceNames.getLast() == deviceName) {System.out.println("Device added successfully.");}
                System.out.println("Current number of devices: " + powerConsumptions.size());
                }


        EnergyManager total = new EnergyManager();
        if (total.totalPower(powerConsumptions) > threshold) {
        System.out.println("!ALERT!: Power consumption is too high!");}
        System.out.println("Calculating energy consumption...");
        System.out.println("Total power consumption: " + total.totalPower(powerConsumptions) + "W");
        System.out.println(total.maxDevice(powerConsumptions) + " is the most consuming device right now.");
        System.out.println("Device list: " + deviceNames);
        System.out.println("Power consumption list: " + powerConsumptions);
    }
}