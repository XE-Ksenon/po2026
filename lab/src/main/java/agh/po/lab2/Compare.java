package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        ArrayList<Integer> userList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            System.out.print("Podaj liczbe: ");
            userList.add(input.nextInt());
        }

        System.out.println("***** Twoje liczby *****");

        for(int i = 0; i < 6; i++){
            System.out.println(userList.get(i));
        }

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

        System.out.println("***** Wylosowane liczby *****");

        for(int i = 0; i < 6; i++){
            System.out.println(list.get(i));
        }

        System.out.println("***********");

        int n = 0;

        for(int i = 0; i < 6; i++){
            if(list.contains(userList.get(i))){
                n++;
            }
        }

        System.out.printf("Trafione: %d", n);
    }
}
