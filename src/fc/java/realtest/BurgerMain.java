package fc.java.realtest;


public class BurgerMain {
    public static void main(String[] args) {
//        Item coke = new Item("drink","coke",1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocade = new Item("Topping","avocade",1.50);
//        avocade.printItem();

//        Burger burger = new Burger("regular",4.0);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder();
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();
//
//        System.out.println("-".repeat(30));
//
//        System.out.println("+".repeat(30));
//        MealOrder three = new MealOrder();
//        three.printItemizedList();


        MealOrder deluxeMeal = new MealOrder("deluxe","7-up","chili");

        deluxeMeal.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();

    }
}
