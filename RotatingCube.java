public class RotatingCube {
    public static void main(String[] args) throws InterruptedException {
        double[][] cube = {
                { -1, -1, -1 }, { 1, -1, -1 }, { 1, 1, -1 }, { -1, 1, -1 },
                { -1, -1, 1 }, { 1, -1, 1 }, { 1, 1, 1 }, { -1, 1, 1 }
        };

        int[][] edges = {
                { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 0 }, { 4, 5 }, { 5, 6 }, { 6, 7 }, { 7, 4 },
                { 0, 4 }, { 1, 5 }, { 2, 6 }, { 3, 7 }
        };

        while (true) {
            char[][] screen = new char[20][40];

            for (int i = 0; i < 20; i++)
                for (int j = 0; j < 40; j++)
                    screen[i][j] = ' ';

            double angle = System.currentTimeMillis() % 10000 / 10000.0 * Math.PI * 2;
            double cosA = Math.cos(angle), sinA = Math.sin(angle);

            double[][] rotatedCube = new double[8][3];
            for (int i = 0; i < 8; i++) {
                rotatedCube[i][0] = cube[i][0] * cosA - cube[i][2] * sinA;
                rotatedCube[i][1] = cube[i][1];
                rotatedCube[i][2] = cube[i][0] * sinA + cube[i][2] * cosA + 3;
            }

            for (int[] edge : edges) {
                int x1 = (int) (20 + rotatedCube[edge[0]][0] * 10 / rotatedCube[edge[0]][2]);
                int y1 = (int) (10 + rotatedCube[edge[0]][1] * 10 / rotatedCube[edge[0]][2]);
                int x2 = (int) (20 + rotatedCube[edge[1]][0] * 10 / rotatedCube[edge[1]][2]);
                int y2 = (int) (10 + rotatedCube[edge[1]][1] * 10 / rotatedCube[edge[1]][2]);

                screen[y1][x1] = '*';
                screen[y2][x2] = '*';
            }

            for (char[] row : screen)
                System.out.println(new String(row));
            Thread.sleep(100);
            System.out.print("\033[H\033[2J");
        }
    }
}
