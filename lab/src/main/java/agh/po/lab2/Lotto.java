package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();

        int x;

        for(int i = 0; i < 6; i++){

            do{
                x = random.nextInt(49) + 1;
            }
            while(list.contains(x));

            list.add(x);
        }

        for(int i = 0; i < 6; i++){
            System.out.println(list.get(i));
        }
    }
}
