package org.example.FinalTask4;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctAnswer = "Заархивированный вирус";
        final String hintMessage = "Это что-то, что хранится в сжатом виде и может содержать вредоносные программы.";

        int attemptsLeft = 3;
        boolean hintUsed = false;

        System.out.println("Загадка:");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");

        while (attemptsLeft > 0) {
            System.out.print("Введите ваш ответ (или 'Подсказка' для подсказки): ");
            String userInput = scanner.nextLine().trim();

            if (userInput.equalsIgnoreCase("Подсказка")) {
                if (!hintUsed) {
                    System.out.println("Подсказка: " + hintMessage);
                    hintUsed = true;
                    attemptsLeft--;
                } else {
                    System.out.println("Подсказка уже недоступна.");
                    attemptsLeft--;
                }
                continue;
            }

            if (userInput.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Правильно!");
                return;
            } else {
                attemptsLeft--;
                if (attemptsLeft > 0) {
                    if (attemptsLeft == 1 && hintUsed) {
                        System.out.println("Обидно, приходи в другой раз");
                        return;
                    }
                    System.out.println("Подумай еще!");
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}
