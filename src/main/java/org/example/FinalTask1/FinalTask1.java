package org.example.FinalTask1;

import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текущий курс доллара: ");
        double exchangeRate = scanner.nextDouble();

        System.out.print("Введите количество рублей: ");
        double rubles = scanner.nextDouble();

        // Конвертация
        double dollars = rubles / exchangeRate;

        // Округление
        double roundedDollars = Math.round(dollars * 100.0) / 100.0;

        // Вывод результата
        System.out.printf("Итого: %.2f долларов%n", roundedDollars);
    }
}
