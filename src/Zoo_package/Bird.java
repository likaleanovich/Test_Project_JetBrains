package Zoo_package;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is flying.");
    }
//    @Override
//    public String getSpecies() {
//        return "eagle";
//    }
//    @Override
//    public void makeSound() {
//        System.out.println(getName() + " screeches.");
//    }
}
