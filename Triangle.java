public class Triangle {
    public static void main(String[] args) {
        int n = 5; // Satır sayısı
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" "); // Boşluk bırak
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
