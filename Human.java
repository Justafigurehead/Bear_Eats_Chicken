public class Human implements Edible {
  
  private int nutrition;

  public Human(int nutrition){
    this.nutrition = nutrition;
  }
  

  public String speak(){
    return "Help! I'm being eaten by a bear!";
  }

  public int nutritionValue(){
    return this.nutrition;
  }
} 