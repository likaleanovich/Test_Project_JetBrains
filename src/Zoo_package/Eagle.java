package Zoo_package;

public class Eagle extends Bird{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public String getSpecies() {
        return "eagle";
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " screeches.");
    }
}
