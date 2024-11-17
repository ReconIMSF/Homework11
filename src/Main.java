import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static java.time.LocalDate LocalDate;

    // Задача 1 - программа, которая проверяет, високосный ли год.
    // Проверка года и распечатка - в методе
    public static void leapYear (int year) {
        boolean leapYearCheck = year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (leapYearCheck) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // Задача 2 - программа, которая определяет текущий год, год выпуска устройства и сообщает, какую версию установить.
    // Проверка года выпуска, версии ПО и распечатка - в методе
    public static void programVersion (int currentYear, int yearOfProduction, byte clientOS) {
        boolean androLight = yearOfProduction < 2015 && clientOS == 1;
        boolean iOSLight = yearOfProduction < 2015 && clientOS == 0;
        boolean androOld = yearOfProduction >= 2015 && yearOfProduction < currentYear && clientOS == 1;
        boolean iOSOld = yearOfProduction >= 2015 && yearOfProduction < currentYear && clientOS == 0;
        boolean andro = yearOfProduction >= 2015 && yearOfProduction == currentYear && clientOS == 1;
        boolean iOS = yearOfProduction >= 2015 && yearOfProduction == currentYear && clientOS == 0;
        if (androLight || androOld) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (iOSLight || iOSOld) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (andro) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println(currentYear);
    }

    // Задача 3 - программа, которая определяет срок доставки карты.
    // Проверка расстояния и распечатка - в методе
    public static void deliveryTime (short deliveryDistance) {
        byte deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime += 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Cвыше 100 км доставки нет");
        }
    }

    public static void main (String[] args) {
        System.out.println("Задача 1");
        short year = 2021;
        leapYear(year);
        System.out.println("Задача 2");
        int yearOfProductuion = 2015;
        int currentYear = LocalDate.now().getYear();
        byte clientOS = 1;
        programVersion(currentYear, yearOfProductuion, clientOS);
        System.out.println("Задача 3");
        short deliveryDistance = 95;
        deliveryTime(deliveryDistance);
    }
}