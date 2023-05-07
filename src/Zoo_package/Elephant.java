package Zoo_package;

public class Elephant extends Animal {
    public Elephant(String name){
        super(name);
    }

    @Override
    public String getSpecies(){
        return "elephant";
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + " trumpets.");
    }
}
