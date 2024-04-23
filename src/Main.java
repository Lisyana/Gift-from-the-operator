public class Main {
    public static void main(String[] args) {

        int moneyOnAccount = 100;

        int TopUpAmount = 2400;
        int bonusSystem = 0;
        int numberOfHundreds = (TopUpAmount / 100);

        if (numberOfHundreds > 10) {
            bonusSystem = bonusSystem + numberOfHundreds;

        }

        int finalBalance = moneyOnAccount + TopUpAmount + numberOfHundreds;
        System.out.println("Текущая сумма на счету: " + moneyOnAccount + "рублей");
        System.out.println("Сумма пополнения: " + TopUpAmount + "рублей");
        System.out.println("Количество бонусных рублей: " + bonusSystem + "рублей");
    }
}