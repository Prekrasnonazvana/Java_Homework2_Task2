public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int initialAmount =100;
        int addAmount = 10001;
        int finalAmount = initialAmount+addAmount;
        int bonus = addAmount/100;
        if (addAmount>1000) {
            System.out.println("Благодарим за пополнение счета. На Вашем счете сейчас " + (finalAmount + bonus) + " рубля(-ей)");
        } else {
                System.out.println("Благодарим за пополнение счета. На Вашем счете сейчас " +finalAmount + " рубля(-ей)");
            }
    }
}