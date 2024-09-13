package org.example.Task13;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку из слов, разделенных пробелами: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        int latinWordCount = 0;
        StringBuilder latinWords = new StringBuilder();

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                latinWords.append(word).append(" ");
                latinWordCount++;
            }
        }

        System.out.println("Слова, состоящие только из латиницы: " + latinWords.toString().trim());

        System.out.println("Количество слов, состоящих только из латиницы: " + latinWordCount);
    }
}
