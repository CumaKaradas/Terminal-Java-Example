public class RotatingCube1 {
    public static void main(String[] args) throws InterruptedException {
        String[] cubeFrames = {
                "   +------+\n" +
                        "  /      /|\n" +
                        " +------+ |\n" +
                        " |      | +\n" +
                        " |      |/\n" +
                        " +------+\n",

                "   +------+ \n" +
                        "  /|     /|\n" +
                        " +------+ |\n" +
                        " | |     | |\n" +
                        " | +-----+ \n" +
                        " +------+\n",

                "   +------+\n" +
                        "  /|     /|\n" +
                        " +------+ |\n" +
                        " | |     | |\n" +
                        " |/      |/\n" +
                        " +------+\n"
        };

        while (true) {
            for (String frame : cubeFrames) {
                System.out.print("\033[H\033[2J");
                System.out.println(frame);
                Thread.sleep(300);
            }
        }
    }
}
