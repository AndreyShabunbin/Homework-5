public class Main {
    public static void main(String[] args) {
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }
        //Задача 2
        int clientOS1 = 1;
        int clientDeviceYear = 2017;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 3
        int year = 2024;

        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является допустимым (год должен быть больше 1584)");
        }
        //Задача 4
        int deliveryDistance = 95;
        int deliveryDays;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
            System.out.println("Доставка не возможна.");
            return;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        //Задача 5
        int monthNumber = 12;

        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Номер месяца должен быть от 1 до 12.");
            return;
        }
        String season;
        switch (monthNumber) {
            case 1: //Январь
            case 2: //Февраль
            case 12: //Декабрь
                season = "Зима";
                break;
            case 3: //Март
            case 4: //Апрель
            case 5: //Май
                season = "Весна";
                break;
            case 6: //Июнь
            case 7: //Июль
            case 8: //Август
                season = "Лето";
                break;
            case 9: //Сентябрь
            case 10: //Октябрь
            case 11: //Ноябрь
                season = "Осень";
                break;
            default:
                season = "Неизвестный сезон";
        }

        System.out.println("Месяц " + monthNumber + " принадлежит к сезону: " + season);
    }
}