package kurs_1;

import java.util.Arrays;

public class lesson6Figures {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 7;
//        System.out.println("Прямоугольник " + a +"*"+ b);
//        for (int number_x=0;number_x < a; number_x++){
//            for (int number_y=0;number_y < b; number_y++){
//                System.out.print("*");
//            }
//            System.out.print("*");
//            System.out.print("\n");
//        }
//
//        System.out.println("Прямоугольный треугольник");
//        for (int counterA=a;counterA >=0; counterA--)
//        {
//            for (int counterAA=0;counterAA<=counterA;counterAA++)
//            {
//                System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//
//        }

        System.out.println("Равносторонний треугольник");
        for (int counterA=a;counterA>=-1; counterA--)
        {
            for (int counterAA=0;counterAA<=counterA;counterAA++)
            {
//                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.print("\n");


        }



        System.out.println("Ромб");
//        System.out.print("*"), System.out.print(" "), System.out.print("\n")
    }
}
