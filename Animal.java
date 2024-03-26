public abstract class Animal {
    protected String name;
    protected double typicalSize; // in kilograms
    protected double typicalWeight; // in meters
    protected boolean isPredator;

    public Animal(String name, double typicalSize, double typicalWeight, boolean isPredator) {
        this.name = name;
        this.typicalSize = typicalSize;
        this.typicalWeight = typicalWeight;
        this.isPredator = isPredator;
    }

    public abstract void displayDetails();
}