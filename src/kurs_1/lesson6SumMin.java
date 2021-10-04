package kurs_1;

import java.util.Arrays;

public class lesson6SumMin {
    public static void main(String[] args) {
        int A, B, sum=0;
        A=3;
        B=7;
        int counter=A, counter2=A;
        for(;counter<=B;counter++)
        {
            sum = sum + counter;
        }
        System.out.println("Сумма всех чисел от " + A +" до "+ B +" равна "+ sum);

        for(;counter2<=B;counter2++)
        {
            if (counter2%2 == 1) System.out.println("Между " + A +" и "+ B +" нечетное число "+ counter2);
        }


    }
}
