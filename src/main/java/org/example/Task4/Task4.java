package org.example.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (x): ");
        int x = scanner.nextInt();

        System.out.print("Введите второе число (y): ");
        int y = scanner.nextInt();

        System.out.print("Введите третье число (z): ");
        int z = scanner.nextInt();

        // 2. Находим среднее арифметическое этих чисел
        double average = (x + y + z) / 3.0;

        // 3. Разделяем среднее арифметическое на 2 и округляем в меньшую сторону
        int result = (int) Math.floor(average / 2);

        // 4. Если полученное число больше 3, выводим сообщение
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }

        scanner.close();
    }

}
