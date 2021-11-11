package Lesson_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int mass[]=new int[]{1,2,3,4,5,6};
        int answer;
        System.out.println("Дан массив:"+ Arrays.toString(mass));
        Scanner scanner=new Scanner(System.in);
        System.out.println("Выберите число,которое хотите удалить:");
        answer=scanner.nextInt();
        if (answer>mass.length){
            System.out.println("Введено некорректное значение");
        }else if (answer< mass.length){
            int newMass[]=new int[mass.length-1];
           for (int i=answer;i< newMass.length;i++){
               newMass[i]=mass[i];// тут я тоже не поняла как делать дальше
           }
            System.out.println("Вы удалили элемент: "+answer);
            System.out.println("Массив после удаления элемента: "+ Arrays.toString(newMass));


        }

    }
}
