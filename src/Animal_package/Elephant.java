package Animal_package;

// класс наследник
public class Elephant extends Animal {
    public Adult age = new Adult(3); // создали объект на основе вложенного класса Adult
    public Elephant(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + " trumpets.");
    }
}
