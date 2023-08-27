import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int win = 0;


        System.out.println("Выберите сумму которую хотите взять с собой: ");
        int wallet = sc.nextInt();

        System.out.println("Добро пожаловать в казино!");
        System.out.println("Принимаем ставки от 1000 - 5000 руб.");
        System.out.println("Сделайте вашу ставку: ");
        int cash = sc.nextInt();

        if (cash >= 1000) {
            wallet = wallet - cash;
            System.out.println("Вы можете принять участие в рулетке.");
            System.out.println("Выберете число от 1 - 10:");
            int yourChoice = sc.nextInt();
            if (getRandom() == yourChoice) {
                win = cash * 2;
                System.out.println("Ваш выигрыш =" + win + " руб.");
            } else if (getRandom()!= yourChoice){
                System.out.println("Вы проиграли, попробуйте еще раз! =)");
                win = 0;
                System.out.println("Ваш выигрыш =" + win + " руб.");
            }
            wallet = wallet + win;
            while (wallet >= 1000) {
                System.out.println("Ваш остаток на счету: " + wallet + " руб.");
                System.out.println("Вы согласны продолжить игру?");
                System.out.println("1. - ДА");
                System.out.println("2. - Нет, я ухожу.");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Сделайте вашу ставку: ");
                        int cash1 = sc.nextInt();
                        wallet = wallet - cash1;

                        System.out.println("Выберете число от 1 - 10:");
                        int newChoice = sc.nextInt();
                        if (getRandom() == newChoice) {
                            win = cash * 2;
                            System.out.println("Ваш выигрыш =" + win + " руб.");
                            wallet = wallet + win;
                        } else {
                            System.out.println("Вы проиграли, попробуйте еще раз! =)");
                            win = 0;
                            System.out.println("Ваш выигрыш =" + win + " руб.");
                        }
                        break;
                    case 2:
                        System.out.println("Удачи вам, приходите еще! =)");
                        System.out.println("В вашем кошельке:" + wallet + " руб.");
                        break;
                }
            }
            System.out.println("В вашем кошельке:" + wallet + " руб.");
            System.out.println("Вы не можете принять участи в рулетке. =(");
            System.out.println("Берите с собой больше денег в следующий раз! =)");
            System.out.println("До свиданья!");
        } else {
            System.out.println("В вашем кошельке:" + wallet + " руб.");
            System.out.println("Вы не можете принять участи в рулетке. =(");
            System.out.println("Берите с собой больше денег в следующий раз! =)");
            System.out.println("До свиданья!");
        }

    }
    public static int getRandom() {
        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rnd = (int) Math.floor(Math.random() * number.length);
        return rnd;
    }
}
