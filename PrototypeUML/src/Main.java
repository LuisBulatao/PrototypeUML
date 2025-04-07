public class Main {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal arturo = registry.createSheep("Arturo");
        arturo.makeSound();

        Animal melbourne = registry.createCow();
        melbourne.makeSound();

        Animal dereck = registry.createHorse();
        dereck.makeSound();



    }
}