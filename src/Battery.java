/**
 * P3.9: Class to model a rechargeable battery
 * @author Brandon Winters
 */
public class Battery {

    /** The maximum capacity of the battery in mAh */
    private final double capacity;
    /** The current charge level of the battery in mAh */
    private double currentCharge;

    /**
     * Constructs a Battery with a provided capacity.
     * @param capacity {@link #capacity}
     */
    public Battery(double capacity) {
        this.capacity = capacity;
        this.charge();
    }

    /**
     * Charges the Battery back to full capacity.
     */
    public void charge() {
        this.currentCharge = capacity;
    }

    /**
     * Drains the Battery's charge by a provided amount.
     * @param amount the amount in mAh to drain the Battery by.
     */
    public void drain(double amount) {
        this.currentCharge -= amount;
        if (currentCharge < 0) {
            currentCharge = 0;
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentCharge() {
        return currentCharge;
    }
}
