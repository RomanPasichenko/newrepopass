package kurs_1;

import java.util.Scanner;

public class lesson4Translator {
    public static void main(String[] args) {
        System.out.println("введите слово о погоде:");

        Scanner input = new Scanner(System.in);
        String buffer = input.next();

        switch (buffer) {
            case ("туман"): {System.out.println("foggy");
                break;}
            case ("солнечно"): {System.out.println("sunny");
                break;}
            case ("облачно"): {System.out.println("cloudy");
                break;}
            case ("пасмурно"): {System.out.println("Mainly cloudy");
                break;}
            case ("метель"): {System.out.println("blizzard");
                break;}
            case ("дождь"): {System.out.println("rain");
                break;}
            case ("ветренно"): {System.out.println("windy");
                break;}
            case ("снег"): {System.out.println("snow");
                break;}

        default :
                System.out.println("такого слова нет в словаре");
        }
    }
}
