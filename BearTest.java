import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class BearTest {

  Bear bear;
  Salmon salmon;
  Human human;
  Chicken chicken;

  @Before 
  public void before() {
    bear = new Bear("Baloo");
    human = new Human(100);
    salmon = new Salmon(25);
    chicken = new Chicken(10);
  }

  @Test
  public void hasName(){
    assertEquals("Baloo", bear.getName());
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon);
    assertEquals(bear.foodCount(), 1);
  }

  @Test
  public void shouldEmptyBellyAfterSleeping(){
    bear.eat(salmon);
    bear.sleep();
    assertEquals(bear.foodCount(), 0);
  }

  @Test 
  public void canEatHuman(){
    bear.eat(human);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canThrowUp(){
    bear.eat(salmon);
    Edible food = bear.throwUp();
    Salmon original = (Salmon)food;
    assertEquals("swimming",original.swim());
  }

  // Test Chicken

  @Test
  public void chickenCanSpeak(){
    assertEquals("Bock Bock",chicken.cluck());
  }

  @Test 
  public void chickenHasNutritionValue(){
    assertEquals(10, chicken.nutritionValue());
  }
  // Test Bear 

  @Test 
  public void bearEatsChicken(){
    bear.eat(chicken);  
    assertEquals(1, bear.foodCount());
  }
  
  @Test 
  public void bearThrowsUpChicken(){
    bear.eat(chicken);
    Edible food = bear.throwUp();
    assertNotNull(food);
    Chicken ptsdChicken = (Chicken) food;
    assertEquals("Bock Bock",ptsdChicken.cluck());
  }

  @Test
  public void bearTotalNutritionvalue(){
    bear.eat(chicken);
    bear.eat(human);
    bear.eat(salmon);
    bear.totalNutrition();
    assertEquals(135, bear.totalNutrition());
  }
  // Human Tests

  @Test
  public void humanHasNutriValue(){
    assertEquals(100, human.nutritionValue());
  }

  // Salmon tests

  @Test
  public void salmonHasNutriValue(){
    assertEquals(25, salmon.nutritionValue());
  }
}