package Zoo_package;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        //создаем объекты животных ипользкуя созданыне переменные
//        Animals elephant = new Animals();
//        elephant.name = "Bonya";
//        Animals lion = new Animals();
//        lion.name = "Simba";
        Animal penguin = new Animal();
        penguin.name = "Riko";
        System.out.println(penguin.getName() + " is a penguin");

        // добавление животных в список
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(penguin);

        // вывод информации о каждом животном
        for (Animal animal : animals) {
            System.out.println(animal.getName());
            System.out.println(animals);
        }
//
//    }

//        //создаем объекты используя конструктор
//        Animal123 elephant = new Animal123("Dumbo");
//        Animal123 lion = new Animal123("Simba");
        Animal snail = new Animal("Beauty");
        System.out.println(snail.getName() + " is a snail");
//        System.out.println("There are " + elephant.getName() + ", " + lion.getName() + ", " + penguin.getName() + " in the Zoo!" );
//    }

        //создаем объекты используя классы наследники
        Elephant elephant = new Elephant("Graf");
        System.out.println(elephant.getName() + " is an " + elephant.getSpecies());
//        elephant.makeSound();
//        elephant.move();

        Lion lion = new Lion("Simba");
        System.out.println(lion.getName() + " is a " + lion.getSpecies());
//        lion.makeSound();
//        lion.move();

        Eagle eagle = new Eagle("Bomb");
        System.out.println(eagle.getName() + " is an " + eagle.getSpecies());
//        eagle.makeSound();
//        eagle.move();



//        System.out.println("There are " + elephant.getName() + " in the Zoo!" );
}


}