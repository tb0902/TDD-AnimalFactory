package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void dogAddTest() {
        Dog dog = new Dog(null, null, 12);
        DogHouse dogHouse = new DogHouse();

        // When you add cat to catHouse, it contains cat
        dogHouse.add(dog);

        Integer expected = 1;
        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
        dogHouse.clear();
    }

    @Test
    public void dogRemoveTest() {
        Dog dog = new Dog(null, null, 13);
        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog);
        dogHouse.remove(dog);

        Integer expected = 0;
        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
        dogHouse.clear();
    }

    @Test
    public void dogRemoveByIdTest() {
        Dog dog = new Dog(null, null, 14);
        DogHouse dogHouse = new DogHouse(); // new, empty cat house

        dogHouse.add(dog); // adding cat #14
        dogHouse.remove(14); // removing cat 14

        Integer expected = 0; // you should have 0 cats.
        Integer actual = dogHouse.getNumberOfDogs(); // the actual counts of cats in the cat house

        Assert.assertEquals(expected, actual); // testing if they ==
        dogHouse.clear(); // making sure you don't keep adding cats
    }

    @Test
    public void dogCatByIdTest() {
        Dog dog = new Dog(null, null, 15);
        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog); // add cat # 15 to the cat house

        Dog expected = dog; // cat # 15 is expected
        Dog actual = dogHouse.getDogById(15); // actual should be the result of get cat by ID

        Assert.assertEquals(expected, actual); // testing if they ==
    }

    @Test
    public void getNumberOfDogsTest() {
        Dog dog = new Dog(null, null, 16);
        Dog dog1 = new Dog(null, null, 17);
        DogHouse dogHouse = new DogHouse();

        dogHouse.add(dog);
        dogHouse.add(dog);

        Integer expected = 2;
        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
        dogHouse.clear();
    }
}

