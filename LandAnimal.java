public class LandAnimal extends Animal {
    private int numberOfLegs;

    public LandAnimal(String name, double typicalSize, double typicalWeight, boolean isPredator, int numberOfLegs) {
        super(name, typicalSize, typicalWeight, isPredator);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void displayDetails() {
        System.out.println("Land Animal Name: " + name);
        System.out.println("Typical Size: " + typicalSize + " lb");
        System.out.println("Typical Weight: " + typicalWeight + " m");
        System.out.println("Predator: " + (isPredator ? "Yes" : "No"));
        System.out.println("Number of Legs: " + numberOfLegs);
    }
}