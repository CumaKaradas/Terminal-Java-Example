import java.util.Random;

public class LightningBolt {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();

        while (true) {
            int position = rand.nextInt(40); // Yıldırımın başlangıç konumu (X ekseni)

            for (int i = 0; i < 10; i++) {
                int shift = rand.nextInt(3) - 1; // Hafif sağa-sola kaydırma
                position += shift;

                for (int j = 0; j < position; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");

                Thread.sleep(100);
            }

            System.out.println("\n⚡ BOOM! ⚡\n");
            Thread.sleep(500);
            System.out.print("\033[H\033[2J"); // Terminal temizleme
        }
    }
}
