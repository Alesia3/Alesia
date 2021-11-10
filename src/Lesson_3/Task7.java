package Lesson_3;

public class Task7 {
    public static void main(String[] args) {
        int [][]mass={{1,2,6},{-5,2,0}};
        int min=mass[0][0];
        for (int i = 0; i< mass.length;i++){
            for (int j=0; j< mass.length; j++){
                  if (mass[i][j]<min){
                  min=mass[i][j];
              }
            }
            System.out.println(min);
        }
    }
}