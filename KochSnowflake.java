public class KochSnowflake {
    public static void main(String[] args) {
        int n = 4; // Fraktal seviyesini artırarak detaylandırabilirsin
        drawKoch(n, "F");
    }

    public static void drawKoch(int n, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        String transformed = str.replace("F", "F-F++F-F");
        drawKoch(n - 1, transformed);
    }
}
