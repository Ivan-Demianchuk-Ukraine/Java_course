//        Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
//        а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3 и в том случаи, если пользователь ввёл
//        какое-либо другое число программа должна отвечать „Вы ввели число не равное 1, 2 или 3“

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        homework1();
        homework2();
        homework3();
    }
    public static void homework1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number: ");
        int first_number = scanner.nextInt();
        System.out.println("Second Number: ");
        int second_number = scanner.nextInt();
        System.out.println("Your Name: ");
        String name = scanner.next();
        String result = name + " - " + (first_number + second_number);
        System.out.println("Result: ");
        System.out.println(result);
    }

    public static void homework2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Correct! You entered number 1");
        } else {
            System.out.println("Wrong! You entered NOT number 1");
        }
    }

    public static void homework3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1, 2 or 3: ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Correct! You entered number 1");
        } if (number == 2) {
            System.out.println("Correct! You entered number 2");
        } else if (number == 3) {
            System.out.println("Correct! You entered number 3");
        } else {
            System.out.println("Wrong! You entered NOT 1,2,3 numbers!");
        }
    }
}