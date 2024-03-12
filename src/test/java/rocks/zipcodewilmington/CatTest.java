package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
      // Given (cat data)
      String givenName = "Zula";
      Date givenBirthDate = new Date();
      Integer givenId = 0;

      // When (a cat is constructed)
      Cat cat = new Cat(givenName, givenBirthDate, givenId);

      // When (we retrieve data from the cat)
      String retrievedName = cat.getName();
      Date retrievedBirthDate = cat.getBirthDate();
      Integer retrievedId = cat.getId();

      // Then (we expect the given data, to match the retrieved data)
      Assert.assertEquals(givenName, retrievedName);
      Assert.assertEquals(givenBirthDate, retrievedBirthDate);
      Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
      // Given (cat name)
      String givenName = "Leo";
      Cat cat = new Cat(null, null, null);

      // When (a name is set)
      cat.setName(givenName);

      // The name is "Leo"
      Assert.assertEquals(givenName, cat.getName());
    }

  @Test
  public void setBirthDateTest() {
    Date birthDay = new Date(1608888630000L);
    Cat cat = new Cat(null, null, null);

    cat.setBirthDate(birthDay);

    Assert.assertEquals(birthDay, cat.getBirthDate());
  }

  @Test
  public void speakTest() {
    Cat cat = new Cat(null, null, null);

    String actual = cat.speak(); // when you test a string (or any return value),
    String expected = "meow!"; // there needs to be an expected and an actual

    Assert.assertEquals(expected, actual); // make sure the expected == the actual
  }

  @Test
  public void eatFoodTest() {
    Cat cat = new Cat(null, null, null);
    Food food = new Food();



    cat.eat(food);
    


  }
}
