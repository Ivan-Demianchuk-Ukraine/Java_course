public class Main {

    public static void main(String[] args) {
        homework5();
        homework6();
        homework7();
        homework8();
        homework9();
    }

    public static void homework5() {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void homework6() {
        int i = 100;
        while (i > 1) {
            System.out.println(i);
            i = i - 10;
        }
    }

    public static void homework7() {
        int i = 7;
        while (i != 105) {
            System.out.println(i);
            i = i + 7;
        }
    }

    public static void homework8() {
        int i = 1;
        while (i != 1024) {
            System.out.println(i);
            i = i * 2;
            }
    }

    public static void homework9() {
        int multiplier = 1;
        for (int i = 10; i > 0; i--){
            System.out.println("3*" + multiplier + "=" + 3 * multiplier);
            multiplier++;
        }
    }
}