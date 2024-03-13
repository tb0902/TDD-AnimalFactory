package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


  @Test
  public void createDogTest() {
    // Given
    // Calling a static method so no given is needed

    // When
    Animal actual = AnimalFactory.createDog("Fido", new Date()); // String needs a 'string literal'


    // Then
    Assert.assertTrue(actual instanceof Dog); // Use the interface to assert if an object within the interface is actually in the interface
  }

  @Test
  public void createCatTest() {
  // Given

  // When
  Animal actual = AnimalFactory.createCat("Leo", new Date());

  // Then
  Assert.assertTrue(actual instanceof Cat);
  }
}
