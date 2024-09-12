package org.example.Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Вводим два числа
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите арифметический оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // 2. В зависимости от символа выполняем соответствующую операцию
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) { // Проверка деления на ноль
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: Деление на ноль.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: Неверный оператор.");
                scanner.close();
                return;
        }

        // Выводим результат
        System.out.println("Результат: " + result);

        scanner.close();
    }
}
