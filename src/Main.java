import java.time.Instant;
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
    public static void programVersion (int currentYear, short yearOfProduction, byte clientOS) {
        boolean androLight = yearOfProduction < currentYear && clientOS == 1;
        boolean iOSLight = yearOfProduction < currentYear && clientOS == 0;
        boolean andro = yearOfProduction == currentYear && clientOS == 1;
        boolean iOS = yearOfProduction == currentYear && clientOS == 0;
        if (androLight) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (iOSLight) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (andro) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
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
        short yearOfProductuion = 2015;
        int currentYear = LocalDate.now().getYear();
        byte clientOS = 1;
        programVersion(currentYear, yearOfProductuion, clientOS);
        System.out.println("Задача 3");
        short deliveryDistance = 95;
        deliveryTime(deliveryDistance);
    }
//    Задача 4
//        System.out.println("Задача 4");
//    short deliveryDistance = 95;
//    int deliveryTime = 0;
//        if (deliveryDistance <= 20) {
//        deliveryTime += 1;
//        System.out.println("Потребуется дней: " + deliveryTime);
//    } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
//        deliveryTime += 2;
//        System.out.println("Потребуется дней: " + deliveryTime);
//    } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
//        deliveryTime += 3;
//        System.out.println("Потребуется дней: " + deliveryTime);
//    } else {
//        System.out.println("Cвыше 100 км доставки нет");
//    }

//
//
//        Задача 3
//        Возвращаемся к задаче на расчет дней доставки банковской карты.
//                Текст прошлого задания
//        В банке для клиентов организовывается доставка карт на дом.Чтобы известить клиента о том, когда будет доставлена
//        его карта, нужно знать расстояние от офиса до адреса доставки.
//                Правила доставки такие:
//        Доставка в пределах 20 км занимает сутки.
//                Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
//        Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
//                Свыше 100 км доставки нет.
//                То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
//                Напишите программу, которая выдает сообщение в консоль: «Потребуется дней: ... »+срок доставки.
//                Объявите целочисленную переменную
//        deliveryDistance = 95, которая содержит дистанцию до клиента.
//
//        Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает
//        итоговое количество дней доставки.


}