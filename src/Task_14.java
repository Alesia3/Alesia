import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner scanner2 =  new Scanner(System.in);
        System.out.println("Значение а ");
        int a = scanner2.nextInt();
        System.out.println("Значение b ");
        int b = scanner2.nextInt();
        System.out.println("Значение c ");
        int c = scanner2.nextInt();
        System.out.println("Результат: "+ (((a-3)*b/2)+c));
    }
}
