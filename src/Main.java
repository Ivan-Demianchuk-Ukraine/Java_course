public class Main {

    public static void main(String[] args) {
        System.out.println(homework10(4, 4));
        test(5);

    }

    public static String homework10(int number1, int number2) {
        if (number1 > number2) {
            return number1 + " - higher than " + number2;
        } else if (number1 < number2) {
            return number2 + " - higher than " + number1;
        } else if (number1 == number2) {
            return "these numbers are the same";
        } else {
            return "Something wrong";
        }
    }

    public static void test(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}