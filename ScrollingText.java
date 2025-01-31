public class ScrollingText {
    public static void main(String[] args) throws InterruptedException {
        String message = " ULTRA GELİŞMİŞ JAVA ANİMASYON! ";
        int width = 40;

        while (true) {
            for (int i = 0; i < message.length(); i++) {
                System.out.print("\033[H\033[2J"); // Terminali temizle
                System.out.println(message.substring(i) + message.substring(0, i));
                Thread.sleep(150);
            }
        }
    }
}
