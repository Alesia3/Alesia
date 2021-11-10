package Lesson_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("Введите два числа: ");
        Scanner input= new Scanner(System.in);
        num1=input.nextInt();
        num2=input.nextInt();
        for (int i=num1+1;i<num2;i++){
            System.out.print(i+" ");

        }



    }
}
