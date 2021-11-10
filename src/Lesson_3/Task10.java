package Lesson_3;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int mass[]=new int[] {1,2,2,4,4,1};
        int num=0;
        System.out.println(Arrays.toString(mass));
        for (int i=0;i<mass.length;i++){
            for (int j=i+1; j< mass.length;j++){
                if (mass[i]==mass[j]){
                    System.out.println(j);//я не понимаю почему не работает)
                }
            }
        }
     }
}
