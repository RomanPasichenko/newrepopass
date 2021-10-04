package kurs_1;

import java.util.Arrays;
import java.util.Scanner;

public class lesson4Calculator {
    public static void main(String[] args) {
        int operand1, operand2;
        Scanner input = new Scanner(System.in);

        operand1 = 10;
        operand2 = 5;

        System.out.println("Введите знак арифметической операции");


        String sign = input.next();
        switch (sign) {
            case ("+"): {
                System.out.println(operand1 + operand2);
                break;
            }
            default : {
                System.out.println("Вы ввели не арифметический символ");
            }
        }
    }
}
