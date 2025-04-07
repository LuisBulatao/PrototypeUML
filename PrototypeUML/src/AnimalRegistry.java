public class AnimalRegistry {
    private Sheep sheepPrototype = new Sheep(4, "Baa", "Grass", "Arturo");
    private Cow cowPrototype = new Cow(4, "Moo", "Hay");
    private Horse horsePrototype = new Horse(4, "Neigh", "Oats", "Red");

    public Animal createSheep(String name) {
        Sheep cloned = (Sheep) sheepPrototype.clone();
        cloned.setName(name);
        return cloned;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}