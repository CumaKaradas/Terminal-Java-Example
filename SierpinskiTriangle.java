public class SierpinskiTriangle {
    public static void main(String[] args) {
        int size = 32; // Daha büyük değerler için üçgen detaylanır
        char[][] triangle = new char[size][2 * size - 1];

        // Boşlukları doldur
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2 * size - 1; j++) {
                triangle[i][j] = ' ';
            }
        }

        drawSierpinski(triangle, size - 1, 0, size);

        // Üçgeni ekrana yazdır
        for (char[] row : triangle) {
            System.out.println(new String(row));
        }
    }

    public static void drawSierpinski(char[][] triangle, int x, int y, int size) {
        if (size == 1) {
            triangle[y][x] = '*';
            return;
        }

        int newSize = size / 2;
        drawSierpinski(triangle, x, y, newSize);
        drawSierpinski(triangle, x - newSize, y + newSize, newSize);
        drawSierpinski(triangle, x + newSize, y + newSize, newSize);
    }
}
