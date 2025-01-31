import java.util.Random;

public class FireEffect {
    public static void main(String[] args) throws InterruptedException {
        final int width = 40, height = 20;
        char[] fireChars = { ' ', '.', '*', '+', 'o', 'O', '@', '#' };
        Random rand = new Random();
        char[][] fire = new char[height][width];

        while (true) {
            // Ateşi yukarı kaydır
            for (int i = 1; i < height; i++) {
                System.arraycopy(fire[i], 0, fire[i - 1], 0, width);
            }

            // Yeni ateş satırını ekle
            for (int j = 0; j < width; j++) {
                fire[height - 1][j] = fireChars[rand.nextInt(fireChars.length)];
            }

            // Terminali temizleyip ateşi yazdır
            System.out.print("\033[H\033[2J");
            for (char[] row : fire) {
                System.out.println(new String(row));
            }

            Thread.sleep(100);
        }
    }
}
