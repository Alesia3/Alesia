package Lesson_3;

public class Task8 {
    public static void main(String[] args) {
        int mass[][] = {{6,2},{3,4}};
        int column = 0;
        for(int i=0; i<mass.length; i++){
            column=0;
            for (int j=0; j< mass.length;j++)
            column = column+mass[j][i];
            System.out.println(column + " ");
        }
        System.out.println(" ");
        }
    }

