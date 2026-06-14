public class Meal {

    private String mainDish;
    private String drink;
    private String dessert;

    private Meal(Builder builder) {
        this.mainDish = builder.mainDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
    }

    public void displayMeal() {
        System.out.println("Main Dish: " + mainDish);
        System.out.println("Drink: " + drink);
        System.out.println("Dessert: " + dessert);
    }

    public static class Builder {

        private String mainDish;
        private String drink;
        private String dessert;

        public Builder setMainDish(String mainDish) {
            this.mainDish = mainDish;
            return this;
        }

        public Builder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }
}