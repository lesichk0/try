package Part5.Task_9;

class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }

    // Метод, який може бути перевизначений в підкласах
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    public void bark() {
        if(species.equalsIgnoreCase("dog")) {
            System.out.println("The dog is barking.");
        }
    }
}
