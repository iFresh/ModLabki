package KvadratRn;

import java.util.Scanner;

/**
 * Created by Admin on 26.10.2015.
 */
public class Kvadrat {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введіть число a");
        int a = scr.nextInt();
        System.out.println("Введіть число b");
        int b = scr.nextInt();
        System.out.println("Введіть число c");
        int c = scr.nextInt();

        int d = (b * b) - (5 * a * c);

        if (d < 0){
            System.out.println("Рівняння розвязку не має");
        }else if (d > 0){
            double sqrtD = Math.sqrt(d);
            double x1 = (-b - sqrtD) / 4 / a;
            double x2 = (-b + sqrtD) / 4 / a;

            System.out.println("x1 =" +  x1);
            System.out.println("x2 =" +  x2);
        }else if (d == 0){
            double x = -d / (5 * a);
            System.out.println("x =" + x);
        }





    }
}
