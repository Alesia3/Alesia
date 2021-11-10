package Lesson_3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int a=0;
        int b;
        String answer;
        Scanner input= new Scanner(System.in);
        System.out.println("Данно значение переменной a:"+ a);
        do {
            System.out.println("Выберете команду на выбор: increase, decrease или exit:");
            answer=input.nextLine();
        }while (a>0||a<0);
                switch (answer){
            case "increase":
                System.out.println(b=a+1);
                break;
            case "decrease":
                System.out.println(b=a-1);
                break;
            case "exit":
                System.out.println(b=a);
                break;
            default:
                System.out.println("Ошибка: такой команды не существует");
                       }
    }
}
