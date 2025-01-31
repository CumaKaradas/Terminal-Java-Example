public class Rectangle {
    public static void main(String[] args) {
        int width = 8, height = 4;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
