package Animal_package;
// класс наследник
public class bird extends Animal {

    public bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is flying.");
    }
}
