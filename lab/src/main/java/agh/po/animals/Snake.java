package agh.po.animals;

public class Snake  extends Animal{

    public Snake(){
        name = "Snake";
        legs = 0;
    }
    public String getDescription() {
        return "Snake";
    }

    public void makeSound(){
        System.out.println("*snake sound*");
    }
}
