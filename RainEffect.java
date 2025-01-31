import java.util.Random;

public class RainEffect {
    public static void main(String[] args) throws InterruptedException {
        final int width = 40, height = 20;
        char[] rainSymbols = { '|', '/', '\\', '|', '.' }; // Yağmur damlaları
        Random rand = new Random();
        char[][] screen = new char[height][width];

        while (true) {
            for (int i = 0; i < height - 1; i++) {
                System.arraycopy(screen[i + 1], 0, screen[i], 0, width);
            }

            for (int j = 0; j < width; j++) {
                screen[height - 1][j] = (rand.nextInt(5) == 0) ? rainSymbols[rand.nextInt(rainSymbols.length)] : ' ';
            }

            System.out.print("\033[H\033[2J"); // Terminal temizleme
            for (char[] row : screen) {
                System.out.println(new String(row));
            }
            Thread.sleep(100);
        }
    }
}
