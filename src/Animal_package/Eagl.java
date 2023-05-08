package Animal_package;
// класс поднаследник
public class Eagl extends Bird{

    public Adult age = new Adult(8); // создали объект на основе вложенного класса Adult
    public Eagl(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " screeches.");
    }

}
