public class AnimatedBanner {
    public static void main(String[] args) {
        String message = "MERHABA DÜNYA!";
        int width = 60;

        try {
            // Sonsuz döngü ile animasyon
            while (true) {
                // Terminal temizleme için ANSI escape code
                System.out.print("\033[H\033[2J");
                System.out.flush();

                // Banner çerçevesi
                printBorder(width, '=', '*');

                // Mesaj satırı
                System.out.println(centerText(message, width));

                // Alt çerçeve
                printBorder(width, '=', '*');

                // Animasyon efekti için mesajı kaydır
                message = message.substring(1) + message.charAt(0);

                // Animasyon hızı
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Animasyon durduruldu.");
        }
    }

    // Çerçeve yazdırma metodu
    private static void printBorder(int width, char line, char corner) {
        System.out.print(corner);
        for (int i = 0; i < width - 2; i++) {
            System.out.print(line);
        }
        System.out.println(corner);
    }

    // Metni ortalama metodu
    private static String centerText(String text, int width) {
        int padding = (width - text.length()) / 2;
        StringBuilder sb = new StringBuilder();
        sb.append("|");

        // Sol boşluk
        for (int i = 0; i < padding; i++) {
            sb.append(" ");
        }

        // Metin
        sb.append(text);

        // Sağ boşluk
        while (sb.length() < width - 1) {
            sb.append(" ");
        }

        sb.append("|");
        return sb.toString();
    }
}