public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 3;
        int d = 7;
        int e = 2;
        int f = 8;
        int g = 4;
        int h = 6;
        int i = 9;
        int j = 1;
        int sum = a + b + c + d + e + f + g + h + i + j;
        System.out.println("sum: " + sum);

        int difference = a - b - c - d - e - f - g - h - i - j;
        System.out.println("difference: " + difference);

        int product = a * b * c * d * e * f * g * h * i * j;
        System.out.println("product: " + product);


        if (b != 0 && c != 0 && d != 0 && e != 0 && f != 0 && g != 0 && h != 0 && i != 0 && j != 0) {
            double division = (double) (a) / (b * c * d * e * f * g * h * i * j);
            System.out.println("division: " + division);
        } else {
            System.out.println("error:");
        }
    }
}
