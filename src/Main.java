public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1100;

        int sum = balance + replenishment;
        int bonus = replenishment / 100;

        System.out.println(sum);
        System.out.println(bonus);
    }
}