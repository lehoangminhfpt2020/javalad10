package lad10.Animal;

public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Dog!");
    }

    public void greeting(Dog another) {
        System.out.println("Dog!");
    }
}
