package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

public class Zoo {
    static Animal[] animals;

    public static void main(String args[]) {
        animals = new Animal[100];

        for(int i = 0; i< animals.length; i++){
            int x = (int)(Math.random() * 3);
            switch (x){
                case 0:
                    animals[i] = new Dog();
                    break;

                case 1:
                    animals[i] = new Parrot();
                    break;

                case 2:
                    animals[i] = new Snake();
                    break;
            }

            int legs = animals[i].getLegs();
            animals[i].getDescription();
            animals[i].makeSound();
        }
    }

    int getLegsSum(){
        int sum = 0;
        for(int i = 0; i<= animals.length; i++) {
            sum += animals[i].legs;
        }
        return sum;
    }
}
