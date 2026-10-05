public class Choinka {
    static void main(String[] args) {
        int h = Integer.parseInt(args[0]);
        float k = Float.parseFloat(args[1]);

        for (int y = 0; y < h; y++) {
            for (int x = (int) (-h * k); x <= (int) (h * k); x++) {
                if (Math.abs(x) <= (int) (y * k)) {
                    IO.print("*");
                } else {
                    IO.print(" ");
                }
            }
            IO.print("\n");
        }
    }
}
