package kurs_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExtraLessons {
    public static void main(String[] args) {
//        Задание 1
//        В одномерном массиве, состоящем из N вещественных чисел вычислить:
//        • Сумму отрицательных элементов.
//        • Произведение элементов, находящихся между min и max элементами.
//        • Сумму элементов, находящихся между первым и последним отрицательными элементами.
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

        int summinus=0;
        for (int i=0; i<operand1; i++)
        {
            if (array[i]<0) summinus=summinus+array[i];
        }
        System.out.println("\nСумму отрицательных элементов:"+summinus);

        int proiz=1;
        for (int i=0; i<operand1; i++)
        {
            if (i%2==0) proiz=proiz*array[i];
        }
        System.out.println("Произведение элементов с четными номерами::"+proiz);


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

        int ProizvMinMax=1;  //        общую сумму всех элементов,
        for (int i=0; i<operand1; i++)
        {
            if (min < array[i] && array[i]<max) ProizvMinMax = ProizvMinMax * array[i];
        }

        System.out.println("Произведение элементов, находящихся между min и max элементами:" + ProizvMinMax);
//       Сумму элементов, находящихся между первым и последним отрицательными элементами.
        int minusA=0, minusN=operand1;
        for (int i=0; i<operand1; i++)
        {
            if (array[i] < 0)
            {
                minusA=i;
                break;
            };
        }
        System.out.println("args1 = " + minusA);

        for (int i=operand1-1; 0<=i; i--)
        {
            if (array[i] < 0)
            {
                minusN=i;
                break;
            };

        }
        int sumA_N = 0;
        for (int i=0; i<operand1;i++)
        {
            if (minusA < i && i < minusN) sumA_N=sumA_N+array[i];
        }
        System.out.println("args2 = " + minusN);
        System.out.println("args = " + sumA_N);
        System.out.println("it is final");
    }
}
