import java.util.Random;

public class StarrySky {
    public static void main(String[] args) throws InterruptedException {
        final int width = 40, height = 20;
        char[][] sky = new char[height][width];
        Random rand = new Random();

        while (true) {
            // Yeni yıldızları ekleyerek ekranı kaydır
            for (int i = height - 1; i > 0; i--) {
                System.arraycopy(sky[i - 1], 0, sky[i], 0, width);
            }

            for (int j = 0; j < width; j++) {
                sky[0][j] = (rand.nextInt(10) < 2) ? '*' : ' ';
            }

            // Terminali temizleyip gökyüzünü yazdır
            System.out.print("\033[H\033[2J");
            for (char[] row : sky) {
                System.out.println(new String(row));
            }

            Thread.sleep(200);
        }
    }
}
