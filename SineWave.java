public class SineWave {
    public static void main(String[] args) throws InterruptedException {
        final int width = 40;
        final int height = 20;
        double t = 0;

        while (true) {
            char[][] screen = new char[height][width];

            // Ekranı boşluklarla doldur
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    screen[i][j] = ' ';
                }
            }

            // Sinüs dalgasını oluştur
            for (int x = 0; x < width; x++) {
                int y = (int) (height / 2 + Math.sin(x * 0.3 + t) * (height / 4));
                if (y >= 0 && y < height) {
                    screen[y][x] = '*';
                }
            }

            // Ekranı yazdır
            for (char[] row : screen) {
                System.out.println(new String(row));
            }

            Thread.sleep(100);
            t += 0.2;
            System.out.print("\033[H\033[2J"); // Terminali temizle
        }
    }
}
