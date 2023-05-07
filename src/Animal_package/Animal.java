package Animal_package;

import java.util.ArrayList;

// создаем родительский класс
public class Animal {

    public String name;
    public static int count = 0; // статическая переменная, которая содержит количество животных в зоопарке, для доступа к статическому полю используется имя класса , а не объекта
                                // поле относится не к отдельному объекту, а к целому классу

//    //создаем массив животных
//    public static Animal[] animals = new Animal[2];
//
//    //создаем объекты животных по массиву
//    Animal giraffe = new Animal("Bobo");
//    Animal monkey = new Animal("Totoo");
//    animals[0] = giraffe;
//    animals[1] = monkey;
//
//
//    // Выводим информацию о животных в зоопарке
//        for (int i = 0; i < animals.length; i++) {
//        System.out.println(animals[i].getName);
//    }

    // создаем конструкторы
    public Animal() {

    }
    public Animal(String name){
           this.name = name;
    }

    // создаем методы
    public String getName(){
           return this.name;
    }
    public void makeSound(){
    }
    public void move() {
        System.out.println(this.name + " is moving.");
    }
    public static void setCount(){
        count++;
        System.out.println("The Zoo has " + count + " animal(s).");
    }

    // Создаем вложенный класс
    public static class Adult {
        public int age;

        public Adult(int age){
            this.age = age;
        }
        public void info(){
            if(age >= 5)
                System.out.println("Animal is adult. It has " + this.age + " years." );
            else
                System.out.println("Animal is young. It has " + this.age + " years." );
        }

    }
}
