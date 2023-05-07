package Zoo_package;

// импортируем классы, которые находятся в другом package
import Animal_package.Animal;
import Animal_package.Eagle;
import Animal_package.Elephant;
import Animal_package.Animal.Adult;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //создаем объект животного ипользуя созданные переменные на основании класса Animal
        Animal lion = new Animal();
        lion.name = "Simba";
        System.out.println(lion.getName() + " is a lion.");
        lion.move();
        lion.setCount();

        //создаем объект используя конструктор из родительского класса Animal
        Animal snail = new Animal("Beauty");
        System.out.println(snail.getName() + " is a snail.");
        snail.move();
        snail.setCount();

        //создаем объект используя конструктор из класса наследника Elephant
        Elephant elephant = new Elephant("Graf");
        System.out.println(elephant.getName() + " is an elephant.");
        elephant.move();
        elephant.setCount();
        elephant.age.info(); // вызвали метод по отображению информации на основе вложенного класса Adult

        //создаем объект используя конструктор из класса поднаследника Eagle
        Eagle eagle = new Eagle("Bomb");
        System.out.println(eagle.getName() + " is an eagle.");
        eagle.move();
        eagle.setCount();
        eagle.age.info(); // вызвали метод по отображению информации на основе вложенного класса Adult

        // создаем анонимный класс
        Elephant fly_elephant = new Elephant("Bobo"){
            @Override
            public void move(){
                System.out.println(this.name + " is an elephant. And " + this.name +  " is flying.");
            }
        };
        fly_elephant.move();
        fly_elephant.setCount();
        }
    }