package kurs_1;

import java.util.Arrays;

public class lesson3_task1 {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;

        System.out.println("x="+x+"\ty="+y+"\tz="+z+"\t x+=y-x++*z = "+(x+=y-x++*z));   // x=(x+y)-x*z = 22-10*3 = -8
        System.out.println("x="+x+"\ty="+y+"\tz="+z+"\t z=--x–y*5 = "+(z=((--x)-y*5))); // z=(-1-8)-12*5 = -69
        System.out.println("x="+x+"\ty="+y+"\tz="+z+"\t y /= x + 5 % z; = "+(y/=x+5%z));// y= y/x + 5%z = 12/(-9) + 5
        System.out.println("x="+x+"\ty="+y+"\tz="+z+"\t z=x+++y*5;  = "+(z=x+++y*5));
        System.out.println("x="+x+"\ty="+y+"\tz="+z+"\t x=y-x++*z; = "+(x=y-x++*z));
        System.out.println("x="+x+"\ty="+y+"\tz="+z);
    }
}
//Задание 1
//        Имеется 3 переменные типаint x = 10, y = 12, и z = 3;
//        Выполните и рассчитайте результат следующих операций для этих переменных:
//         x+=y-x++*z;  z=--x–y*5;  y /= x + 5 % z;
//         z=x+++y*5;  x=y-x++*z;