// Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {
        int limit = 1000;

        System.out.println("Простые числа от 1 до " + limit + ":");
        for (int number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Проверка числа на простоту
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
