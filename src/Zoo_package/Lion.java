package Zoo_package;
public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public String getSpecies() {
        return "lion";
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " roars.");
    }
}
