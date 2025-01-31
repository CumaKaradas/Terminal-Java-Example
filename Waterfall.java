import java.util.Random;

public class Waterfall {
    public static void main(String[] args) throws InterruptedException {
        final int width = 40, height = 20;
        char[] waterDrops = { '|', '/', '\\', '|' };
        Random rand = new Random();
        char[][] screen = new char[height][width];

        while (true) {
            for (int i = height - 1; i > 0; i--) {
                System.arraycopy(screen[i - 1], 0, screen[i], 0, width);
            }

            for (int j = 0; j < width; j++) {
                screen[0][j] = (rand.nextInt(4) == 0) ? waterDrops[rand.nextInt(waterDrops.length)] : ' ';
            }

            System.out.print("\033[H\033[2J");
            for (char[] row : screen) {
                System.out.println(new String(row));
            }

            Thread.sleep(100);
        }
    }
}
