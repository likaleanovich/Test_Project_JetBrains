package Animal_package;
// класс наследник
public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is flying.");
    }
}
