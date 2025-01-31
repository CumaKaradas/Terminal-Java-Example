public class Mandelbrot {
    public static void main(String[] args) {
        int width = 80, height = 40;
        double xmin = -2.0, xmax = 1.0, ymin = -1.2, ymax = 1.2;
        int maxIterations = 1000;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                double real = xmin + (xmax - xmin) * x / width;
                double imag = ymin + (ymax - ymin) * y / height;

                int iterations = mandelbrot(real, imag, maxIterations);
                char c = iterations == maxIterations ? ' ' : (char) ('A' + iterations % 26);
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static int mandelbrot(double real, double imag, int maxIterations) {
        double zReal = 0, zImag = 0;
        int iter = 0;
        while (zReal * zReal + zImag * zImag < 4 && iter < maxIterations) {
            double temp = zReal * zReal - zImag * zImag + real;
            zImag = 2 * zReal * zImag + imag;
            zReal = temp;
            iter++;
        }
        return iter;
    }
}
