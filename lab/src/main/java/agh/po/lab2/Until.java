package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Until {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();

        int x = 0;
        for (int i = 0; i < 6; i++) {

            do {
                x = random.nextInt(49) + 1;
            }
            while (list.contains(x));

            list.add(x);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));
        }

        long before = System.currentTimeMillis();

        for (int i = 0; i < 6; i++) {

            do {
                x = random.nextInt(10000) + 1;
            }
            while (!list.contains(x));

            list.remove(Integer.valueOf(x));

            System.out.println("\n");
            System.out.println("***** Trafiono *****");
            System.out.println(x);
            System.out.println("***** Pozostało *****");
            for (int j = 0; j < list.size(); j++) {
                System.out.println(list.get(j));
            }
        }

        long after = System.currentTimeMillis();

        System.out.println("\n");
        System.out.println("***** Czas [ms] *****");
        System.out.println(after - before);
    }
}

