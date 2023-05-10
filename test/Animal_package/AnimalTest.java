package Animal_package;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * tests for class Animal5678.class
 */
class AnimalTest {

    private Animal animal = new Animal("Test");

    @Test
    void getName() {
        Animal lion = new Animal();
        lion.name = "Simba";
        assertEquals("Simba", lion.getName());
    }

    @Test
    void makeSound() {
    }

    @Test
    void move() {
    }

    @Test
    void setCount() {
    }
}