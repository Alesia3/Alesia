package Lesson_3;

public class Task6 {
    public static void main(String[] args) {
        int sum=0;
        int Mass[]=new int[]{4,-2,6,2};
        for (int i=0;i< Mass.length;i++){
            if (Mass[i]>0&Mass[i]%2==0)
                sum+=Mass[i];
        }
        System.out.println(sum);
    }
}
