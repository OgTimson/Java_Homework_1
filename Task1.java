// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// Пример: 1 + 2 + 3 | 1 * 2* 3

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        sc.close();

        // Вычисление n-го треугольного числа
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
        }
        System.out.println("n-ое треугольное число: " + triangleNumber);

        // Вычисление факториала n
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("n!: " + factorial);
    }
}