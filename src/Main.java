//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // задание 1 и 2
        int clientOs = 0;
        int clientDeviceYear = 2022;
        if (clientOs == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOs == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        } else if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        // Задание 3

        int year = 1322;
        if (year > 1586) {
            System.out.println();
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // задание 4

        int deliveryDistance = 15;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("потребуется " + day + " день");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            day++;
            System.out.println("потребуется " + day + " дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("потребуется " + day + " дня");
        } else {
            System.out.println("доставка не осуществляется");
        }


        // задание 5
        int monthNumber = 20;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println();

        }

    }
}