package Lesson_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int numA,numB;
        System.out.println("Введите два числа: ");
        Scanner input= new Scanner(System.in);
        numA=input.nextInt();
        numB=input.nextInt();
        for (int i=numA+1;i<numB;i++){
            System.out.print(i+" ");

        }



    }
}
