public class Bird extends Animal {
    private double wingspan; // in meters

    public Bird(String name, double typicalSize, double typicalWeight, boolean isPredator, double wingspan) {
        super(name, typicalSize, typicalWeight, isPredator);
        this.wingspan = wingspan;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bird Name: " + name);
        System.out.println("Typical Size: " + typicalSize + " lb");
        System.out.println("Typical Weight: " + typicalWeight + " m");
        System.out.println("Predator: " + (isPredator ? "Yes" : "No"));
        System.out.println("Wingspan: " + wingspan + " m");
    }
}