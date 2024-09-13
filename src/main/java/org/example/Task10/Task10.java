package org.example.Task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        // Ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Элемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Проверка, что матрица не пустая
        if (rows > 0 && cols > 0) {
            // Вывод первой строки матрицы, умноженной на 3
            System.out.println("Первая строка матрицы, умноженная на 3:");
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[0][j] * 3 + " ");
            }
        } else {
            System.out.println("Матрица должна содержать хотя бы одну строку и один столбец.");
        }
    }
}
