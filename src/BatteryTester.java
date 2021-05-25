public class BatteryTester {

    public static void main(String[] args) {
        Battery battery = new Battery(3000);
        System.out.println("Capacity: " + battery.getCapacity());
        System.out.println("Expected: 3000.0");
        System.out.println("Current charge: " + battery.getCurrentCharge());
        System.out.println("Expected: 3000.0");
        battery.drain(1500);
        System.out.println("Current charge after 1500 mAh drain: " + battery.getCurrentCharge());
        System.out.println("Expected: 1500.0");
        battery.charge();
        System.out.println("Current charge after charge: " + battery.getCurrentCharge());
        System.out.println("Expected: 3000.0");
    }
}
