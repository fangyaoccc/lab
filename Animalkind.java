public class Animalkind {
    public static void main(String[] args) {
        Bird eagle = new Bird("American Eagle", 5, 0.9, true, 2.2);
        LandAnimal tiger = new LandAnimal("Tiger", 300, 1.1, true, 4);
        Fish salmon = new Fish("Tuna", 1.5, 0.8, false, 2);

        eagle.displayDetails();
        System.out.println();
        tiger.displayDetails();
        System.out.println();
        salmon.displayDetails();
    }
}