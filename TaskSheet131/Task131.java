package TaskSheet131;

class Afritada {
  public void showIngredients() {
    String[] Ingredients = {"Tomato Sauce","Meat"};
    System.out.println("Afritada = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}

class Mechado extends Afritada {
  public void showIngredients() {
    String[] Ingredients = {"Tomato Sauce","Meat","Carrots","Potatoes","Soy Sauce","Garlic"};
    System.out.println("Mechado = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}

class Menudo extends Afritada {
  public void showIngredients() {
    String[] Ingredients = {"Tomato Sauce","Meat","Carrots","Potatoes","Bell Peppers","Raisins","Peas"};
    System.out.println("Menudo = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}

class Caldereta extends Afritada {
  public void showIngredients() {
    String[] Ingredients = 
      {"Tomato Sauce",
       "Meat",
       "Potatoes & Carrots",
       "Tomato Paste",
       "Liver Spread",
       "Raisins",
       "Hotdog",
       "Siling Labuyo",
       "Cheese"};
    System.out.println("Caldereta = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}

public class Task131 {
    public static void main(String[] args) {
      // Create objects of different types
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Mechado();
        Afritada meal3 = new Menudo();
        Afritada meal4 = new Caldereta();
      
      // Display ingredients for each meal
        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}

