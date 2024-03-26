public class Fish extends Animal {
    private int numberOfFins;

    public Fish(String name, double typicalSize, double typicalWeight, boolean isPredator, int numberOfFins) {
        super(name, typicalSize, typicalWeight, isPredator);
        this.numberOfFins = numberOfFins;
    }

    @Override
    public void displayDetails() {
        System.out.println("Fish Name: " + name);
        System.out.println("Typical Size: " + typicalSize + " lb");
        System.out.println("Typical Weight: " + typicalWeight + " m");
        System.out.println("Predator: " + (isPredator ? "Yes" : "No"));
        System.out.println("Number of Fins: " + numberOfFins);
    }
}