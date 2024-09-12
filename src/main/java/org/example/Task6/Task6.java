package org.example.Task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Обработка массы (допустим, будем переводить из килограммов)
                System.out.println("Выберите единицу измерения массы: 1 - килограмм, 2 - фунт");
                int massUnit = scanner.nextInt();
                System.out.println("Введите количество:");
                double massValue = scanner.nextDouble();

                switch (massUnit) {
                    case 1: // Килограмм
                        System.out.println("Килограммы: " + massValue);
                        System.out.println("Фунты: " + massValue * 2.20462);
                        break;
                    case 2: // Фунт
                        System.out.println("Фунты: " + massValue);
                        System.out.println("Килограммы: " + massValue * 0.453592);
                        break;
                    default:
                        System.out.println("Ошибка: Неверный выбор единицы измерения массы.");
                }
                break;

            case 2:
                // Обработка расстояния
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int distanceUnit = scanner.nextInt();
                System.out.println("Введите число:");
                double distanceValue = scanner.nextDouble();

                switch (distanceUnit) {
                    case 1: // Метр
                        System.out.println("Метры: " + distanceValue);
                        System.out.println("Мили: " + distanceValue * 0.000621371);
                        System.out.println("Ярды: " + distanceValue * 1.09361);
                        System.out.println("Футы: " + distanceValue * 3.28084);
                        break;
                    case 2: // Миля
                        System.out.println("Мили: " + distanceValue);
                        System.out.println("Метры: " + distanceValue * 1609.34);
                        System.out.println("Ярды: " + distanceValue * 1760);
                        System.out.println("Футы: " + distanceValue * 5280);
                        break;
                    case 3: // Ярд
                        System.out.println("Ярды: " + distanceValue);
                        System.out.println("Метры: " + distanceValue * 0.9144);
                        System.out.println("Мили: " + distanceValue * 0.000568182);
                        System.out.println("Футы: " + distanceValue * 3);
                        break;
                    case 4: // Фут
                        System.out.println("Футы: " + distanceValue);
                        System.out.println("Метры: " + distanceValue * 0.3048);
                        System.out.println("Мили: " + distanceValue * 0.000189394);
                        System.out.println("Ярды: " + distanceValue * 0.333333);
                        break;
                    default:
                        System.out.println("Ошибка: Неверный выбор единицы измерения расстояния.");
                }
                break;

            default:
                System.out.println("Ошибка: Неверный выбор типа величины.");
        }

        // Закрываем Scanner
        scanner.close();

    }
}
