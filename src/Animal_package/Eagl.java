package Animal_package;
// класс поднаследник
public class Eagl extends bird {

    public Adult2 age = new Adult2 (8); // создали объект на основе вложенного класса Adult
    public Eagl(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " screeches.");
    }

}
