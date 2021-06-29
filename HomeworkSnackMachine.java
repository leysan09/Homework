//TODO: добавить пакет, если файл будет внутри пакета
package Homework;
import java.util.Scanner;

//TODO 1: Добавить описание программы и авторство

/*
 * Описание программы:
 * Программа разработана для автомата со снеками. Три вида товара.
 * Запрашивает количество товара и деньги, выдает сдачу.
 * @ainutdinova Лейсан Айнутдинова
 */
public class HomeworkSnackMachine {

    public static void main(String[] args) {
        byte max = 3;
        byte min = 0;

        String [] products = {"сок", "вода", "печенье"};
        int [] prices = {50, 15, 25};
        //TODO 2: создать массив с количеством каждого продукта
        int [] amount = {50, 70, 30};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Вывод списка товаров
            System.out.println("Доступные продукты:");
            for (int i = 0; i < 3; i++) {
                System.out.println(i + 1 + " - " + products[i]);
            }

            System.out.println("Введите номер продукта: ");
            byte number = scanner.nextByte();
            if (number >= min && number <= max) {
                System.out.println("Вы выбрали: " + products[number - 1] + ". Стоимость: " + prices[number - 1] + " руб. " +
                "В наличии " + amount[number - 1] + " шт.");
                System.out.println("Введите количество:");
                int quantity = scanner.nextInt();
                if ( amount[number-1] - quantity > 0)
                    System.out.println("Осталось:" + (amount[number-1] - quantity));
                else{
                    System.out.println("Количество превышено. Введите меньше "
                            + amount[number - 1] + " шт.");
                }
                if ( amount[number-1] - quantity > 0){
                System.out.println("Введите деньги: ");}
                int money = scanner.nextInt();

                //TODO 3: добавить условие есть ли в наличии нужный товар

                if ( money >= prices[number - 1] * quantity) {
                    System.out.println("Вы купили: " + products[number - 1] + ". Cдача: " + (money - (prices[number - 1] * quantity)));
                    //TODO 4: если купили товар, здесь нужно изменить его количество в массиве - минус 1

                } else {
                    System.out.println("Недостаточно средств. Внесите ещё: " + (prices[number - 1] * quantity - money));

                }

            } else {
                System.out.println("Введите номер от " + min + " до " + max);
            }

            System.out.println("Продолжить покупки?");
            String answer = scanner.next();
            if(!answer.toLowerCase().equals("да")) {
                break;
            }

            //TODO 5*: попробуйте добавить в алгоритм покупки вопрос про количетво товара, чтобы можно было покупать не по 1 штуке,
            // а сразу несколько, например, 3 сока. Добавьте необходимые изменения в условия: хватает ли денег и хватает ли количества товара

            //TODO 6*: попробуйте улучшить алгоритм, например, учитывать деньги которые внесли ранее и их не хватило.
            // Предложите, что ещё можете улучшить (можно в комментариях, если не знаете как точно это реализовать)
        }
    }
}
