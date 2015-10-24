package Modul;

/**
 * Created by Admin on 23.10.2015.
 */
public class SumEvenEndTd {

    public static void main(String[] args){

        int a = 2;
        int b = 14;

        int sumEven = 0;
        int sumOdd = 0;


        for (int i = a; i <= b; i++){
            System.out.println(i);
            if(i % 4 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }


        System.out.println("Сума парних:" + sumEven);
        System.out.println("Сума непарних" + sumOdd);
    }
}
