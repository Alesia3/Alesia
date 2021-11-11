package Lesson_3;

public class Task5 {
    public static void main(String[] args) {
        int Mass[]=new int[]{2,5,115,-11,22};
        int maxNumber=Mass[0];
        for (int i=0;i< Mass.length;i++){
            if (Mass[i]>maxNumber){
                maxNumber=Mass[i];
            }
        }
        System.out.println(maxNumber);
    }

        }




