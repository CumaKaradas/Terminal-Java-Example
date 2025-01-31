import java.util.Random;

public class BlackHole {
    public static void main(String[] args) throws InterruptedException {
        final int size = 20;
        Random rand = new Random();

        while (true) {
            System.out.print("\033[H\033[2J");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (rand.nextInt(size) > Math.abs(i - size / 2) + Math.abs(j - size / 2)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            Thread.sleep(100);
        }
    }
}
