public class Main {
    public static void main(String[] args) {
        Device Inverter = new Device("Inverter", 2000);
        System.out.println(Inverter.getdeviceName() + " consumes " + Inverter.getpowerCons() + "W");
    }
}
