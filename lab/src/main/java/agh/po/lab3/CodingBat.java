package agh.po.lab3;

import java.util.Objects;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat codingBat = new CodingBat();

        if (codingBat.sleepIn(true, true)) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }

        if (codingBat.diff21(58) == 74) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }

        if (codingBat.countEvens(new int[]{1, 2, 3, 4, 5}) == 2) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }

        if (Objects.equals(codingBat.helloName("Mati"), "Hello Mati!")) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public int countEvens(int[] nums) {
        int n = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                n++;
            }
        }

        return n;
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }
}
