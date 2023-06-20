// Реализовать простой калькулятор (+-/*)

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = sc.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = sc.nextDouble();

        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        sc.close();

        double result;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Ошибка: деление на ноль недопустимо.");
                return;
            }
        } else {
            System.out.println("Ошибка: недопустимая операция.");
            return;
        }

        System.out.println("Результат: " + result);
    }
}
