import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание №5");
        String[] nazv = {"Крыса", "Бык", "Тигр", "Кролик", "Дракон",
                "Змея", "Лошадь", "Коза", "Обезьяна", "Петух", "Собака", "Свинья"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, месяц, год (например: 5 12 1974)");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        String zodiacGod = nazv[(year - 4) % 12];

        String zodiacSign = "";
        switch (month) {
            case 1:
                if (day < 20) {
                    zodiacSign = "Козерог";}
                else {zodiacSign = "Водолей";}
                break;
            case 2:
                if (day < 19) {
                    zodiacSign = "Водолей";}
                else {zodiacSign = "Рыбы";}
                break;
            case 3:
                if (day < 21){
                    zodiacSign = "Рыбы";}
                else {zodiacSign = "Овен";}
                break;
            case  4:
                if (day < 20) {
                    zodiacSign = "Овен";}
                else {zodiacSign = "Телец";}
                break;
            case 5:
                if (day < 21) {
                    zodiacSign = "Телец";}
                else {zodiacSign = "Близнецы";}
                break;
            case 6:
                if (day < 22) {
                    zodiacSign = "Близнецы";}
                else {zodiacSign = "Рак";}
                break;
            case 7:
                if (day < 23) {
                    zodiacSign = "Рак";}
                else {zodiacSign = "Лев";}
                break;
            case 8:
                if (day < 23) {
                    zodiacSign = "Лев";}
                else {zodiacSign = "Дева";}
                break;
            case 9:
                if (day < 23) {
                    zodiacSign = "Дева";}
                else {zodiacSign = "Весы";}
                break;
            case 10:
                if (day < 23) {
                    zodiacSign = "Весы";}
                else {zodiacSign = "Скорпион";}
                break;
            case 11:
                if (day < 23) {
                    zodiacSign = "Скорпион";}
                else {zodiacSign = "Стрелец";}
                break;
            case 12:
                if (day < 22) {
                    zodiacSign = "Стрелец";}
                else {zodiacSign = "Козерог";}
                break;
        }
        System.out.println("Знак: " + zodiacSign);
        System.out.println("Год: " + zodiacGod);
    }
}
