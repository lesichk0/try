package Part5.Task_11;

class Person {
    private final Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    void interactWithAnimal() {
        animal.eat();
        animal.sleep();
    }
}
