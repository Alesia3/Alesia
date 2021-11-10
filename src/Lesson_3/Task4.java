package Lesson_3;

import java.util.IllegalFormatCodePointException;

public class Task4 {
    public static void main(String[] args) {
        int mass[]=new int[] {6,2,6,4,5,7};
        int sum=0;
        for (int i=0;i<mass.length;i++){
            if (mass[i]%2==0)
            sum+=mass[i];
        }
        System.out.println(sum);
    }
    }


