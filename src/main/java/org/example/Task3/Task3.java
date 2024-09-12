package org.example.Task3;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        // 2. Поменяем местами первый и последний элемент в массиве
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        // 3. Выведем результат суммы первого и среднего элемента
        int firstElement = array[0];
        int middleElement = array[array.length / 2];
        int sum = firstElement + middleElement;

        System.out.println("Сумма первого и среднего элемента: " + sum);
    }
  }
