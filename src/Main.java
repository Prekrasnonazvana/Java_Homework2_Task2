public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;
        int addAmount = 10001;
        int finalAmount = initialAmount + addAmount;
        int bonus = addAmount / 100;

        if (addAmount > 1000) {
            System.out.println("Благодарим за пополнение счета. На Вашем счете сейчас " + (finalAmount + bonus) + " рубля(-ей)");
        } else {
            System.out.println("Благодарим за пополнение счета. На Вашем счете сейчас " + finalAmount + " рубля(-ей)");
        }
    }
}