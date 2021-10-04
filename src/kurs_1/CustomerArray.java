package kurs_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
//        Задание 2 Используя IntelliJ IDEA, создайте класс CustomerArray.
//        Требуется: Создать массив размера N элементов, заполнить его произвольными целыми значениями
//        (размер массива задает пользователь).
//        Вывести на экран: наибольшее значение массива,
//        наименьшее значение массива,
//        общую сумму всех элементов,
//        среднее арифметическое всех элементов,
//        вывести все нечетные значения.
        Random random = new Random();

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int operand1 = input.nextInt();
        int[] array = new int[operand1];

        System.out.print("Массив [ ");
        for (int i=0; i < operand1; i++)
        {
            array[i] = random.nextInt(5+5)-5;
            System.out.print(array[i]+", ");
        }
        System.out.print("]");
        int max=array[0]; //        Вывести на экран: наибольшее значение массива,
        for (int i=0; i<operand1; i++)
        {
            if (array[i] >max)
            max = array[i];
        }
        System.out.println("\nmax = " + max);

        int min=array[0];   //        наименьшее значение массива,
        for (int i=0; i<operand1; i++)
        {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("min = " + min);

        int sum=0;  //        общую сумму всех элементов,
        for (int i=0; i<operand1; i++)
        {
                sum = sum + array[i];
        }

        System.out.println("SUM = " + sum);
        //        среднее арифметическое всех элементов,

        System.out.println("среднее арифметическое всех элементов = " + (double)sum/operand1);

        //        вывести все нечетные значения.

        for (int i=0; i<operand1; i++)
        {
            if (array[i]%2 ==1)
                System.out.println("нечетные значение" + array[i]);
        }
        System.out.println("it is final");

    }
}
