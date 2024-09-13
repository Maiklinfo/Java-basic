package org.example.FinalTask3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n <= 0) {
            System.out.println("Количество строк должно быть положительным.");
            return;
        }

        String[] lines = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            lines[i] = scanner.nextLine();
        }

        String maxUniqueString = "";
        int maxUniqueCount = -1;

        for (String line : lines) {

            Set<Character> uniqueChars = new HashSet<>();
            for (char c : line.toCharArray()) {
                uniqueChars.add(c);
            }

            int uniqueCount = uniqueChars.size();
            if (uniqueCount > maxUniqueCount) {
                maxUniqueCount = uniqueCount;
                maxUniqueString = line;
            }
        }

        System.out.println("Ответ: " + maxUniqueString);
    }
}
