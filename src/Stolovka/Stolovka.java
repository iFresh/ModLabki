package Stolovka;

import java.awt.*;

/**
 * Created by Admin on 26.10.2015.
 */
public class Stolovka {

    public static void main(String[] args) {


        Menu[] strava = new Menu[6];
        strava[0] = new Menu(125, 25, "Пельмені");
        strava[1] = new Menu(115, 15, "Вареники");
        strava[2] = new Menu(60, 15, "Жарена картошка");
        strava[3] = new Menu(55, 8, "Сок");
        strava[4] = new Menu(45, 10, "Кава");
        strava[5] = new Menu(155, 55, "Піцца");


        for (int i = 0; i < strava.length; i++) {
            System.out.println(strava[i]);

        }


    }
}
