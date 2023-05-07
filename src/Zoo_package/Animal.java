package Zoo_package;

public class Animal {
    //создаем переменную
    public String name;

    // создаем конструктор
       public Animal(){
       }
       public Animal(String name){
           this.name = name;
    }

    // создаем методы
    public String getName(){

           return this.name;
    }
    public String getSpecies() {
            return getSpecies();
    }
    public void makeSound(){
    };
    public void move() {
        System.out.println(this.name + " is moving");
    }
}
