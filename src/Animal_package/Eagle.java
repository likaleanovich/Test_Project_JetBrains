package Animal_package;
// класс поднаследник
public class Eagle extends Bird{

    public Adult age = new Adult(8); // создали объект на основе вложенного класса Adult
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " screeches.");
    }

}
