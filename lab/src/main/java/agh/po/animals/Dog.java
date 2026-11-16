package agh.po.animals;

public class Dog  extends Animal{
    public Dog(){
        name = "Dog";
        legs = 4;
    }
    public String getDescription() {
        return "Dog";
    }

    public void makeSound(){
        System.out.println("*dog sound*");
    }
}
