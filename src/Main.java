public class Main {

    public static void main(String[] args) {
        homework5();
        homework6();
        homework7();
        homework8();
        homework9();
    }

    public static void homework5() {
        String result = "";
        for (int i = 5; i > 0; i--) {
            result = result + i + " ";
        }
        System.out.println(result);
    }

    public static void homework6() {
        String result = "";
        int i = 110;
        while (i > 10) {
            i = i - 10;
            result = result + i + " ";
        }
        System.out.println(result);
    }

    public static void homework7() {
        String result = "";
        int i = 0;
        while (i != 98) {
            i = i + 7;
            result = result + i + " ";
        }
        System.out.println(result);
    }

    public static void homework8() {
        String result = "";
        int i = 1;
        while (i != 512) {
            i = i * 2;
            result = result + i + " ";
            }
        System.out.println(1 + " " + result);
    }

    public static void homework9() {
        int multiplier = 1;
        for (int i = 10; i > 0; i--){
            System.out.println("3*" + multiplier + "=" + 3 * multiplier);
            multiplier++;
        }
    }
}