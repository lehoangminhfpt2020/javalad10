package lad10.Animal;

public class BigDog extends Dog {
    @Override
    public void greeting(){
        System.out.println("DOG!");
    }
    @Override
    public void greeting(Dog another){
        System.out.println("DOG!");
    }
}
