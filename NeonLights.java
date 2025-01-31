public class NeonLights {
    public static void main(String[] args) throws InterruptedException {
        String[] colors = { "\u001B[31m", "\u001B[33m", "\u001B[32m", "\u001B[36m", "\u001B[34m", "\u001B[35m" };
        String reset = "\u001B[0m";
        String text = "███████████████████████";

        while (true) {
            for (int i = 0; i < colors.length; i++) {
                System.out.print("\r" + colors[i] + text + reset);
                Thread.sleep(200);
            }
        }
    }
}
