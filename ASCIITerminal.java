public class ASCIITerminal {
    public static void main(String[] args) {
        // Terminal boyutları
        int width = 40;
        int height = 20;

        // Terminal çerçevesi
        System.out.println("+" + repeatChar('-', width - 2) + "+");

        // Terminal içeriği
        for (int i = 0; i < height - 2; i++) {
            System.out.print("|");

            // Her satır için farklı bir pattern
            if (i % 4 == 0) {
                System.out.print(repeatChar('*', width - 2));
            } else if (i % 4 == 1) {
                System.out.print(repeatChar('~', width - 2));
            } else if (i % 4 == 2) {
                System.out.print(repeatChar('#', width - 2));
            } else {
                System.out.print(repeatChar('.', width - 2));
            }

            System.out.println("|");
        }

        // Alt çerçeve
        System.out.println("+" + repeatChar('-', width - 2) + "+");
    }

    // Karakteri tekrar eden yardımcı metod
    private static String repeatChar(char c, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}