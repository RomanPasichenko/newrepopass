package kurs_1;

import java.util.Arrays;
import java.util.Scanner;

public class lesson7Arithmetics {
    static int sum(int a, int b) {
        int res;
        res = a + b;
        return res;
    }
    static int sub(int a, int b) {
        int res;
        res = a - b;
        return res;
    }
    static int mul(int a, int b) {
        int res;
        res = a * b;
        return res;
    }
    static double div(int a, int b) {
        double res;
        res = (double)a/b;
        return res;
    }
    public static void main(String[] args) {
//        int operand1, operand2;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        int operand1 = input.nextInt();

        System.out.println("Введите второе число");
        int operand2 = input.nextInt();

        System.out.println("Введите знак арифметической операции");
        String sign = input.next();
        switch (sign) {
            case ("+"): {
                System.out.println(sum(operand1,operand2));
                break;
            }
            case ("-"): {
                System.out.println(sub(operand1,operand2));
                break;
            }
            case ("*"): {
                System.out.println(mul(operand1,operand2));
                break;
            }
            case ("/"): {
                if (operand2!=0) System.out.println(div(operand1,operand2));
                else System.out.println("Деление на 0 запрещено!!!");

                break;
            }
            default : {
                System.out.println("Вы ввели не арифметический символ");
            }
//            Используя IntelliJ IDEA, создайте класс Arithmetics.
//            Создайте четыре метода для выполнения арифметических операций, с именами:
//            add – сложение,
//            sub – вычитание,
//            mul – умножение,
//            div – деление. Метод деления div, должен выполнять проверку попытки деления на ноль.
//            Каждый метод должен принимать два целочисленных аргумента и выводить на экран результат выполнения
//            арифметической операции соответствующей имени метода.
//            Требуется предоставить пользователю возможность вводить с клавиатуры значения операндов
//            и знак арифметической операции, для выполнения вычислений.

        }

    }
}
