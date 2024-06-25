# Java Polymorphism Demonstration

## Explanation

### Class Definitions:

- The `Afritada` class has a method `showIngredients` that prints the ingredients for Afritada.
- The `Mechado` and `Menudo` classes extend `Afritada` and override the `showIngredients` method to provide their specific ingredients.
- The `Caldereta` class extends `Afritada` and also overrides the `showIngredients` method.

### Main Method:

- Four objects (`meal1`, `meal2`, `meal3`, and `meal4`) are created, each representing a different dish but all of type `Afritada`.
- The `showIngredients` method is called on each object to display the ingredients.

## Usage

To test this code, copy it into your Java IDE, compile and run it. It will display the ingredients for each meal, demonstrating polymorphism where a single reference type (`Afritada`) is used to refer to objects of various derived classes (`Mechado`, `Menudo`, `Caldereta`).
