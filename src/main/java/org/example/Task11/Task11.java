package org.example.Task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите первое число (строка): ");
        String firstInput = scanner.nextLine();


        System.out.print("Введите второе число (целое число): ");
        int secondNumber = scanner.nextInt();


        int firstNumber;
        try {
            firstNumber = Integer.parseInt(firstInput);
        } catch (NumberFormatException e) {
            System.out.println("Первое число не является допустимым целым числом.");
            return;
        }


        if (firstNumber > secondNumber) {
            System.out.println("Большее число: " + firstNumber);
            System.out.println("Меньшее число (в формате double): " + (double) secondNumber);
        } else {
            System.out.println("Большее число: " + secondNumber);
            System.out.println("Меньшее число (в формате double): " + (double) firstNumber);
        }
    }
}
