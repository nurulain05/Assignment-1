/**
 * Stores smartphone details and provides methods to use them.
 */
public class Smartphone {
    // Private attributes demonstrate encapsulation.
    private String brand;
    private String model;
    private int storageGB;
    private int ramGB;
    private int batteryPercent;
    private double price;
    private boolean is5G;

    // Default constructor assigns default values.
    public Smartphone() {
        brand = "Unknown";
        model = "Unknown";
        storageGB = 128;
        ramGB = 8;
        batteryPercent = 100;
        price = 0.0;
        is5G = false;
    }

    // Parameterized constructor initializes the object with given values.
    public Smartphone(String brand, String model, int storageGB,
                      int ramGB, int batteryPercent,
                      double price, boolean is5G) {
        this.brand = brand;
        this.model = model;
        setStorageGB(storageGB);
        setRamGB(ramGB);
        setBatteryPercent(batteryPercent);
        setPrice(price);
        this.is5G = is5G;
    }

    // Getters return values from private attributes.
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getStorageGB() { return storageGB; }
    public int getRamGB() { return ramGB; }
    public int getBatteryPercent() { return batteryPercent; }
    public double getPrice() { return price; }
    public boolean getIs5G() { return is5G; }

    // Setters update private attributes.
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }

    public void setStorageGB(int storageGB) {
        if (storageGB > 0) this.storageGB = storageGB;
    }

    public void setRamGB(int ramGB) {
        if (ramGB > 0) this.ramGB = ramGB;
    }

    public void setBatteryPercent(int batteryPercent) {
        if (batteryPercent >= 0 && batteryPercent <= 100)
            this.batteryPercent = batteryPercent;
    }

    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }

    public void setIs5G(boolean is5G) { this.is5G = is5G; }

    // Additional method 1: checks the battery level.
    public String checkBatteryStatus() {
        if (batteryPercent <= 20) return "Low Battery";
        else return "Battery is Good";
    }

    // Additional method 2: calculates remaining storage.
    public int calculateRemainingStorage(int usedStorageGB) {
        int remaining = storageGB - usedStorageGB;
        if (remaining < 0) return 0;
        return remaining;
    }

    // Additional method 3: displays all smartphone details.
    public void displayInfo() {
        System.out.println("\n--- Smartphone Information ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storageGB + " GB");
        System.out.println("RAM: " + ramGB + " GB");
        System.out.println("Battery: " + batteryPercent + "%");
        System.out.println("Price: RM" + price);
        System.out.println("5G Support: " + (is5G ? "Yes" : "No"));
    }
}
