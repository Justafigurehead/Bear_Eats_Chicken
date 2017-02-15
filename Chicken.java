public class Chicken implements Edible {
    
    private int nutrition;

    public Chicken(int nutrition){
      this.nutrition = nutrition;
    }

    public String cluck(){
      return "Bock Bock";
    }

    public int nutritionValue(){
      return this.nutrition;
    }
}