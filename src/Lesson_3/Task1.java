package Lesson_3;

public class Task1 {
    public static void main(String[] args) {
        int n=9;
        int a=1;
        int b=1;
        int i;
        System.out.print(a+" "+b);
        for (i=3; i<=n;i++){
            b=a+b;
            a=b-a;
            System.out.print(" "+b);
        }
    }
}
