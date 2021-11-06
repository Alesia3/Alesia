import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number1= scanner.nextInt();
        System.out.println("Введите второе число:");
        int number2= scanner.nextInt();
        System.out.println("Сумма Ваих чисел: "+ (number1+number2));
    }
}
