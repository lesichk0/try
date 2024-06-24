package Part5.Task_10;

abstract class CookingRecipe {
    public final void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }

    protected abstract void addIngredients();
    protected abstract void cook();

    // Методи, які можуть бути однакові для всіх рецептів
    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void serve() {
        System.out.println("Serving");
    }
}
