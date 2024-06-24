package Part5.Task_11;

class Dog {
    private final Animal animal;

    public Dog(){
        this.animal = new Animal();
    }
    void eat() {
        animal.eat();
    }
    void sleep() {
        animal.sleep();
    }
    void bark() {
        System.out.println("Dog is barking");
    }
}
