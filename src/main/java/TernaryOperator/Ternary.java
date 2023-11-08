package TernaryOperator;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        String result = number > 0 ? number % 7 < 4 ? "positive-m" : "positive-p" : number == 0 ? number % 7 > -4 ? "zero" : "negative-m" : "negative-p";
        System.out.println(result);
    }
}