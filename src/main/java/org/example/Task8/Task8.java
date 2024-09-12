package org.example.Task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Вводим целое положительное число n
        System.out.print("Введите целое положительное число n: ");
        int n = scanner.nextInt();

        // Проверка на положительность числа
        if (n <= 0) {
            System.out.println("Ошибка: Введите положительное число.");
            scanner.close();
            return;
        }

        // Инициализация суммы
        int sum = 0;

        // Суммируем нечетные числа от 1 до n
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        // Выводим результат
        System.out.println("Сумма всех нечетных чисел от 1 до " + n + " равна: " + sum);


        scanner.close();
    }
}
