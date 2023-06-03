public class Main {

    public static long TestIntLong(int a, long b) {
        return a + b;
    }

    public static boolean TestDoubleFloat(double a, float b, int c) {
        return a == b && a == c;
    }

    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;

        float e = 5.5f;
        double g = 6.7;
        boolean j = true;
        char h = 7;
        char z = 9;
        int k = (int) (b - d);
        int in = b + a;
        System.out.println(TestIntLong(99, 13));
        System.out.println(TestDoubleFloat(99, 99, 99));
        System.out.println(b * d);
        System.out.println(g / c);
        System.out.println(j);
        System.out.println(g + e);
        System.out.println(h);
        System.out.println(z + h);
        System.out.println(a != 0);
        System.out.println(Math.round(g));
        System.out.println(k);
        System.out.println(in);
        System.out.println(in + k);

    }

}
