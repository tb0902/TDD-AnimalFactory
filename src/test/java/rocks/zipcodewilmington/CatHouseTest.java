package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


  @Test
  public void catAddTest() {
  Cat cat = new Cat(null, null, 12);
  CatHouse catHouse = new CatHouse();

  // When you add cat to catHouse, it contains cat
  catHouse.add(cat);

  Integer expected = 1;
  Integer actual = catHouse.getNumberOfCats();

  Assert.assertEquals(expected, actual);
  catHouse.clear();
  }

  @Test
  public void catRemoveTest() {
  Cat cat = new Cat(null, null, 13);
  CatHouse catHouse = new CatHouse();

  catHouse.add(cat);
  catHouse.remove(cat);

  Integer expected = 0;
  Integer actual = catHouse.getNumberOfCats();

  Assert.assertEquals(expected, actual);
  catHouse.clear();
  }

  @Test
  public void catRemoveByIdTest() {
  Cat cat = new Cat(null, null, 14);
  CatHouse catHouse = new CatHouse(); // new, empty cat house

  catHouse.add(cat); // adding cat #14
  catHouse.remove(14); // removing cat 14

  Integer expected = 0; // you should have 0 cats.
  Integer actual = catHouse.getNumberOfCats(); // the actual counts of cats in the cat house

  Assert.assertEquals(expected, actual); // testing if they ==
  catHouse.clear(); // making sure you don't keep adding cats
  }

  @Test
  public void getCatByIdTest() {
  Cat cat = new Cat(null, null, 15);
  CatHouse catHouse = new CatHouse();

  catHouse.add(cat); // add cat # 12 to the cat house

  Cat expected = cat; // cat # 12 is expected
  Cat actual = catHouse.getCatById(15); // actual should be the result of get cat by ID

  Assert.assertEquals(expected, actual); // testing if they ==
  }

  @Test
  public void getNumberOfCatsTest() {
  Cat cat = new Cat(null, null, 16);
  Cat cat2 = new Cat(null, null, 17);
  CatHouse catHouse = new CatHouse();

  catHouse.add(cat);
  catHouse.add(cat2);

  Integer expected = 2;
  Integer actual = catHouse.getNumberOfCats();

  Assert.assertEquals(expected, actual);
  catHouse.clear();
  }
}
