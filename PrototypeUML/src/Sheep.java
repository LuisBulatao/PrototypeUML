public class Sheep implements Animal{

    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.food = food;
        this.legs = legs;
        this.sound = sound;
        this.name = name;
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public Animal clone() {
        return new Sheep(legs, sound, food, name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
