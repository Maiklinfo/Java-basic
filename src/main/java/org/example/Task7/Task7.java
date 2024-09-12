package org.example.Task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Задаем константы
        final int X = 5;
        final int Y = 10;
        final int Z = 15;

        // Создаем Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // 1. Ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создаем массив указанного размера
        int[] array = new int[size];

        // Ввод данных в массив
        System.out.println("Введите " + size + " целых чисел, разделяя каждое новое число пробелом:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Закрываем Scanner
        scanner.close();

        // 2. Проверка элементов массива
        boolean found = false;
        for (int num : array) {
            if (num == X || num == Y || num == Z) {
                found = true;
                break;
            }
        }

        // 3. Вывод сообщения
        if (found) {
            System.out.println("Данное значение имеется в константах.");
        } else {
            System.out.println("Значений из констант в массиве нет.");
        }
    }
}
