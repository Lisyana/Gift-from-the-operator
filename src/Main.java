public class Main {
    public static void main(String[] args) {

        int moneyOnAccount = 100;

        int topUpAmount = 2400;
        int bonusSystem = 0;
        int numberOfHundreds = (topUpAmount / 100);

        if (numberOfHundreds > 10) {
            bonusSystem = bonusSystem + numberOfHundreds;

        }

        int finalBalance = moneyOnAccount + topUpAmount + numberOfHundreds;
        System.out.println("Текущая сумма на счету: " + moneyOnAccount + "рублей");
        System.out.println("Сумма пополнения: " + topUpAmount + "рублей");
        System.out.println("Количество бонусных рублей: " + bonusSystem + "рублей");
    }
}