import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание №3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите животное: ");
        System.out.println("1.Кошка\n" + "2.Собака\n" + "3.Корова\n" + "4.Коза\n" + "5.Утка\n" + "6.Мышь\n" + "7.Ворона\n" + "8.Осёл\n" + "9.Волк\n" + "10.Лягушка\n");
        int animal = sc.nextInt();
        switch (animal) {
            case 1:
                System.out.println("Мяу");
                break;
            case 2:
                System.out.println("Гав");
                break;
            case 3:
                System.out.println("Му");
                break;
            case 4:
                System.out.println("Бе");
                break;
            case 5:
                System.out.println("Кря");
                break;
            case 6:
                System.out.println("Пи");
                break;
            case 7:
                System.out.println("Кар");
                break;
            case 8:
                System.out.println("Иа");
                break;
            case 9:
                System.out.println("Ауф");
                break;
            case 10:
                System.out.println("Ква");
                break;
            default:
                System.out.println("Ты ввёл что-то другое!");
                break;
        }
        System.out.println();
    }
}
