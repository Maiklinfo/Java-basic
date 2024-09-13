package org.example.FinalTask2;

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите уравнение, используя только следующие символы:");
        System.out.println("1. Цифры от 0 до 9");
        System.out.println("2. Символ 'x' (обозначает неизвестное)");
        System.out.println("3. Символы '+' или '-' для операций");
        System.out.println("4. Символ '=' для обозначения равенства");
        System.out.println("Пример: x+5=7, 3-x=9, 3-3=x");

        System.out.print("Введите уравнение (длиной 5 символов): ");
        String equation = scanner.nextLine();

        if (equation.length() != 5) {
            System.out.println("Ошибка: Введите строку длиной 5 символов.");
            return;
        }

        String leftSide = equation.substring(0, 3); // Первая часть до '='
        String rightSide = equation.substring(4);   // Вторая часть после '='


        char operator = equation.charAt(1);
        char xPositionLeft = leftSide.charAt(0);
        char xPositionMiddle = leftSide.charAt(1);
        char xPositionRight = leftSide.charAt(2);

        int a = 0, b = 0, result = 0;

        if (xPositionLeft == 'x') {

            b = Character.getNumericValue(xPositionMiddle);
            a = Character.getNumericValue(xPositionRight);
            result = Integer.parseInt(rightSide);
        } else if (xPositionMiddle == 'x') {

            a = Character.getNumericValue(xPositionLeft);
            b = Character.getNumericValue(xPositionRight);
            result = Integer.parseInt(rightSide);
        } else if (xPositionRight == 'x') {

            a = Character.getNumericValue(xPositionLeft);
            b = Character.getNumericValue(xPositionMiddle);
            result = Integer.parseInt(rightSide);
        } else {
            System.out.println("Ошибка: Неверное расположение символов.");
            return;
        }

        switch (operator) {
            case '+':
                if (xPositionLeft == 'x') {
                    System.out.println("Решение: " + (result - b));
                } else if (xPositionMiddle == 'x') {
                    System.out.println("Решение: " + (result - a));
                } else if (xPositionRight == 'x') {
                    System.out.println("Решение: " + (a + b));
                }
                break;

            case '-':
                if (xPositionLeft == 'x') {
                    System.out.println("Решение: " + (result + b));
                } else if (xPositionMiddle == 'x') {
                    System.out.println("Решение: " + (a - result));
                } else if (xPositionRight == 'x') {
                    System.out.println("Решение: " + (a - b));
                }
                break;

            default:
                System.out.println("Ошибка: Неверный оператор. Ожидался '+' или '-'.");
                break;
        }
    }
}
