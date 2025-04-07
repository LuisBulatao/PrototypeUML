public interface Animal extends Cloneable {
    String getType();
    void makeSound();

    Animal clone();
}
