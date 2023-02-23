import java.time.LocalDate;

public class Main {
//    public static void printSeparator() {
//        System.out.println("======+=======");
//    }

//    public static void printIssues(int issueCount) {
//        System.out.println(issueCount);
//    }

    //    public static int sum(int[] number) {
//        int sum = 0;
//        for (int i = 0; i < number.length; i++) {
//            sum = sum + number[i];
//        }
//        return sum;
//    }

    public static void printSymbol() {
        System.out.println("");
    }

    public static void main(String[] args) {

//        int[] issuesOfMonth = {1, 2, 6, 10, 22, 3, 4, 7, 2, 5, 8, 9, 10, 4,};
//        printSeparator();
//        for (int i = 0; i < issuesOfMonth.length; i++) {
//            printIssues(issuesOfMonth[i]);
//            if ((i + 1) % 3 == 0) {
//                printSeparator();
//            }
//        }
//        printSeparator();
//        int total = sum(issuesOfMonth);
//        printIssues(total);

        task1();
        task2();
        task3();
    }

    public static void printYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }
    }
    public static void task1() {
        System.out.println("Задача № 1.");
        printSymbol();

        int year = 2000;
        printYear(year);

        printSymbol();
    }

    public static void printPhoneVersionAndroid(int clientDeviceYear, int clientOs) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static void printPhoneVersionOs(int clientDeviceYear, int clientOs) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }
    }
    public static void task2() {
        System.out.println("Задача № 2.");
        printSymbol();

        int clientOs = 1; // (0 — iOS, 1 — Android)
        int clientDeviceYear = 2023;

        printPhoneVersionAndroid(clientDeviceYear, clientOs);
        printPhoneVersionOs(clientDeviceYear, clientOs);

        printSymbol();
    }

    public static int printTotalDaysDelivery (int deliveryDistance) {

        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуются 1 сутки для доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 суток для доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 суток для доставки");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        }
        return deliveryDistance;
    }
    public static void task3() {
        System.out.println("Задача № 3.");
        printSymbol();

        int deliveryDistance = 12;
        printTotalDaysDelivery(deliveryDistance);

       printSymbol();
    }
}

