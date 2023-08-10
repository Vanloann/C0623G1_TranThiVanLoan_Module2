package ss07_abstractclass_interface.practice.animal;

import ss07_abstractclass_interface.practice.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    String makeSound() {
        return "chicken crow!";
    }

    @Override
    public String howToEat() {
        return "chicken-fried with fish sauce";
    }
}
