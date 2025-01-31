public class SpiralPattern {
    public static void main(String[] args) throws InterruptedException {
        final int WIDTH = 40, HEIGHT = 20;
        double angle = 0;

        while (true) {
            char[][] screen = new char[HEIGHT][WIDTH];

            // Boşlukları doldur
            for (int i = 0; i < HEIGHT; i++) {
                for (int j = 0; j < WIDTH; j++) {
                    screen[i][j] = ' ';
                }
            }

            // Spiral hesaplama
            for (double t = 0; t < 20; t += 0.2) {
                int x = (int) (WIDTH / 2 + t * Math.cos(angle + t));
                int y = (int) (HEIGHT / 2 + t * Math.sin(angle + t));

                if (x >= 0 && x < WIDTH && y >= 0 && y < HEIGHT) {
                    screen[y][x] = '*';
                }
            }

            // Çizimi ekrana yazdır
            for (char[] row : screen) {
                System.out.println(new String(row));
            }

            Thread.sleep(100); // Yenileme hızı
            angle += 0.1;
            System.out.print("\033[H\033[2J"); // Terminali temizler
        }
    }
}
