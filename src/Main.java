public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1500;

        int newBalance;
        if (replenishment >= 1100) {
            int bonus = replenishment / 100;
            newBalance = balance + replenishment + bonus;
        } else {
            newBalance = balance + replenishment;
        }

        System.out.println("Итоговый баланс: " + newBalance);
    }
}
