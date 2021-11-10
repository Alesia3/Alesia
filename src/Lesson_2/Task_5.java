package Lesson_2;

public class Task_5 {
    public static void main(String[] args) {
        double doubleValue=3.66;
        int value =(int)doubleValue;
        System.out.println(value);
        long value1=Math.round(doubleValue);
        System.out.println(value1);
        long value2=(long) Math.ceil(doubleValue);
        System.out.println(value2);
        long value3= (long) Math.floor(doubleValue);
        System.out.println(value3);
    }
}
