public class StarWarsIntro {
    public static void main(String[] args) throws InterruptedException {
        String[] lines = {
                "A long time ago in a galaxy far, far away...",
                "",
                "EPISODE VII",
                "THE FORCE AWAKENS",
                "",
                "Luke Skywalker has vanished.",
                "In his absence, the sinister FIRST ORDER has risen.",
                "",
                "Only the RESISTANCE stands against them..."
        };

        for (int i = lines.length; i >= 0; i--) {
            System.out.print("\033[H\033[2J");
            for (int j = i; j < lines.length; j++) {
                System.out.println(lines[j]);
            }
            Thread.sleep(500);
        }
    }
}
