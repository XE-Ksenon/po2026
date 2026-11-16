package agh.po.animals;

public class Parrot extends Animal{
    public Parrot(){
        name = "Parrot";
        legs = 2;
    }
    public String getDescription() {
        return "Parrot";
    }

    public void makeSound(){
        System.out.println("*parrot sound*");
    }
}
