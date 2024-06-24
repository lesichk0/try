package Part5.Task_10;

class CakeRecipe extends CookingRecipe {
    @Override
    public void addIngredients() {
        System.out.println("Adding flour, sugar, eggs, etc.");
    }
    @Override
    public void cook() {
        System.out.println("Baking the cake in the oven");
    }
}
