public class CirclePattern {
    public static void main(String[] args) {
        int radius = 10;
        int size = 2 * radius + 1;

        for (int y = -radius; y <= radius; y++) {
            for (int x = -radius; x <= radius; x++) {
                if (Math.abs(x * x + y * y - radius * radius) < radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
