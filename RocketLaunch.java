public class RocketLaunch {
    public static void main(String[] args) throws InterruptedException {
        String[] rocket = {
                "       |       ",
                "      / \\      ",
                "     |   |     ",
                "    /     \\    ",
                "   |       |   ",
                "   |  🚀  |   ",
                "   |_______|   ",
                "    /     \\    ",
                "   /       \\   ",
                "  |         |  "
        };

        int height = 20; // Roketin havalanacağı yükseklik
        for (int i = height; i >= 0; i--) {
            System.out.print("\033[H\033[2J"); // Terminali temizle
            for (int j = 0; j < i; j++) {
                System.out.println();
            }
            for (String line : rocket) {
                System.out.println(line);
            }
            Thread.sleep(200);
        }

        System.out.println("\n🚀 BOOOM! Roket Uzaya Çıktı! 🚀\n");
    }
}
