public class Salmon implements Edible, Swimmable {
  
  private int nutrition;

  public Salmon(int nutrition){
    this.nutrition = nutrition;
  }


  public String swim(){
   return "swimming";
  }

  public int nutritionValue(){
    return this.nutrition;
  }
}