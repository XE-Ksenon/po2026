package agh.po.lab1;

public class Tree {
    public static void main(String[] args) {
        int h = Integer.parseInt(args[0]);
        float k = Float.parseFloat(args[1]);

        for (int y = 0; y < h; y++) {
            for (int x = (int) (-h * k); x <= (int) (h * k); x++) {
                if (Math.abs(x) <= (int) (y * k)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
