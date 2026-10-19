package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Until {
    public static void main(String[] args) {
        ArrayList<Integer> userList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            userList.add(Integer.valueOf(args[i]));
        }

        System.out.println("***** Twoje liczby *****");

        for (int i = 0; i < 6; i++) {
            System.out.println(userList.get(i));
        }

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> retainedList = new ArrayList<>();

        Random random = new Random();

        long before = System.currentTimeMillis();

        int k = 0, x;
        do {
            list.clear();

            do {
                x = random.nextInt(49) + 1;

                if (!list.contains(x)) {
                    list.add(x);
                }
            }
            while (list.size() != 6);


            retainedList = list;
            retainedList.retainAll(userList);

            k++;
        }
        while (retainedList.size() != 6);


        System.out.println("***** Wylosowane liczby *****");

        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));
        }

        long after = System.currentTimeMillis();

        System.out.println("\n");
        System.out.println("***** Losowano [razy] *****");
        System.out.println(k);
        System.out.println("***** Czas [ms] *****");
        System.out.println(after - before);
    }
}

