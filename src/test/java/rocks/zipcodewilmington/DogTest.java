package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDateTest() {
    Dog dog = new Dog(null, null, null);
    Date dogBday = new Date();

    dog.setBirthDate(dogBday);

    Date dogDate = dog.getBirthDate();
    Assert.assertEquals(dogDate, dogBday);
    }

    @Test
    public void speakTest() {
    Dog dog = new Dog(null, null, null);

    String actual = dog.speak();
    String expected = "bark!";

    Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatFoodTest() {
    Dog dog = new Dog(null, null, null);
    Food food = new Food();

    dog.eat(food);
    Integer expected = 1;

    Assert.assertEquals(dog.getNumberOfMealsEaten(), expected);
    }

    @Test
    public void dogIsAnimalTest() {
    Dog dog = new Dog(null, null, null);
    Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void dogIsMammalTest() {
    Dog dog = new Dog(null, null, null);
    Assert.assertTrue(dog instanceof Mammal);
    }
}
