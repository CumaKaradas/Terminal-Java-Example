public class ClockAnimation {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            int second = (int) (System.currentTimeMillis() / 1000) % 60;
            int angle = second * 6; // 360 dereceyi 60 saniyeye böl
            drawClock(angle);
            Thread.sleep(1000);
        }
    }

    public static void drawClock(int angle) {
        int radius = 6;
        char[][] screen = new char[13][13];

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                screen[i][j] = ' ';
            }
        }

        // Kadranı çiz
        for (int i = 0; i < 360; i += 30) {
            int x = (int) (6 + radius * Math.cos(Math.toRadians(i)));
            int y = (int) (6 + radius * Math.sin(Math.toRadians(i)));
            screen[y][x] = '.';
        }

        // Akrep (saniye kolu)
        int x = (int) (6 + radius * Math.cos(Math.toRadians(angle)));
        int y = (int) (6 + radius * Math.sin(Math.toRadians(angle)));
        screen[y][x] = 'o';

        // Çizimi ekrana yazdır
        System.out.print("\033[H\033[2J"); // Terminali temizle
        for (char[] row : screen) {
            System.out.println(new String(row));
        }
    }
}
