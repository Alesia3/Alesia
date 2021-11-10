package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int answer, number;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        number = random.nextInt(5);
        System.out.println("Случайное число: "+ number);
        do {
            System.out.println("Угадайте число от 0 до 4: ");
            answer = scanner.nextInt();
        } while (number> answer||number<answer);
            System.out.println("Вы угадали. Правильное число: " + number);



    }
}
