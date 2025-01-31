public class LoadingSpinner {
    public static void main(String[] args) throws InterruptedException {
        String[] spinner = { "|", "/", "-", "\\" };
        int i = 0;

        while (true) {
            System.out.print("\rYükleniyor " + spinner[i % spinner.length]);
            i++;
            Thread.sleep(150);
        }
    }
}
