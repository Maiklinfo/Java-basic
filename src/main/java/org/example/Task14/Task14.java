package org.example.Task14;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        final int SIZE = 15;

        int[] array = new int[SIZE];
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt(41) - 20;
        }

        System.out.print("Массив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Поиск максимального и минимального элемента
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < SIZE; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Вывод максимального и минимального элемента
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);

        // Вывод наибольшего по модулю значения
        int maxAbsolute = Math.abs(max) > Math.abs(min) ? max : min;
        System.out.println("Наибольшее по модулю значение: " + maxAbsolute);
    }
}
