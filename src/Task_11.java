public class Task_11 {
    public static void main(String[] args) {
        int t = 3603;
        int hours = t / 3600;
        int minutes = (t % 3600) / 60;
        int seconds = t % 60;
        System.out.println(hours+ "ч " + minutes + "мин " + seconds + "с");
    }
}
