public class TestBuilderPattern {

    public static void main(String[] args) {

        Meal meal = new Meal.Builder()
                .setMainDish("Fried Rice")
                .setDrink("Juice")
                .setDessert("Ice Cream")
                .build();

        meal.displayMeal();
    }
}