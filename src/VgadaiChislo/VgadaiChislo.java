package VgadaiChislo;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Admin on 26.10.2015.
 */
public class VgadaiChislo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(101);
        int response;

        System.out.println("Я задумав число від 0 до 100, спробуйте відгадати його");

        while (true) {
            response = Integer.parseInt(scanner.nextLine());

            if (response < randomNumber) {
                System.out.println("Ні, спробуйте більше число");
            } else if (response > randomNumber) {
                System.out.println("Ні, спробуйте менше число");
            } else {
                System.out.println("Ви відгадали!");
                return;
            }
        }
    }
}


