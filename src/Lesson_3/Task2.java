package Lesson_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 9:");
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
switch (number){
    case 0:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
        System.out.println(number + " дней");
        break;
    case 1:
        System.out.println(number + " день");
        break;
    case 2:
    case 3:
    case 4:
        System.out.println(number + " дня");
        break;
    default:
        if(number<0){
            System.out.println("Ошибка, число меньше 0");
        }
        else {
            System.out.println("Вы ввели число больше 9. Данная функция пока не доступна");
        }
}
    }
}
