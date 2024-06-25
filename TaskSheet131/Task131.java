/**
 * Student: Junmar P.
 * Trainer: Sir Marco
 * School: SLTCFI
 * Course: Java NCIII - Batch 2 
 *
 * 
 * Title: Demonstrate Java Polymorphism of various types
 * 
 * Performance Objective: GGiven a java file Task131.java in a single package named Task13  you should be able
 * to write a program that can reference variables to refer to objects of various types at different times and
 * compile it to run in a java virtual machine without errors following Java Standard Edition specification.
 */


 package TaskSheet131;

 class Afritada {
   public void showIngredients() {
     String[] Ingredients = {"Tomato Sauce","Meat"};
     System.out.println("Afritada = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
   }
 }
 
 class Mechado extends Afritada {
   public void showIngredients() {
     String[] Ingredients = {"Tomato Sauce","Meat","Potatoes & Carrots","Tomato Paste"};
     System.out.println("Mechado = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
   }
 }
 
 class Menudo extends Afritada {
   public void showIngredients() {
     String[] Ingredients = {"Tomato Sauce","Meat","Potatoes & Carrots","Liver Spread","Raisins","Hotdog"};
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
 
