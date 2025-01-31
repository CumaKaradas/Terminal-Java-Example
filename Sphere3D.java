public class Sphere3D {
    public static void main(String[] args) {
        int size = 20;
        double r = size / 2.0;

        for (int y = -size; y <= size; y += 2) {
            for (int x = -size; x <= size; x++) {
                double z = Math.sqrt(r * r - x * x - y * y);
                if (!Double.isNaN(z)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
