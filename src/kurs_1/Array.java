package kurs_1;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] array = {19,17,15,13,11,9,-7,6,4,3};
        double sum=0;
        //Задание 1: Заполнить массив из 10 элементов любыми числами. Подсчитать среднее арифметическое элементов массива.
        for (int i=0; i< array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("среднее арифметическое = " + sum/array.length);
//        Задание 2: Написать программу, которая выводит только четные числа массива из 10-ти элементов
//        (используйте операцию остаток от деления, чтобы проверить число на чётность)
        for (int j=0; j < array.length; j++) {
            if (array[j] %2==0)
            System.out.println("Это четное число из массива: "+array[j]);
            }

//      Задание 3: В массиве, состоящем из N вещественных чисел вычислить произведение четных элементов.
        int res = 1;
        for (int n=0; n < array.length; n++)
        {
            if (array[n]%2==0)
            res = res*array[n];
        }
        System.out.println(res);
        }
}

