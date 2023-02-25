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
        System.out.println("=========================================================");
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

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

        int year = 2000;
        printYear(year);

        printSymbol();
    }

    public static void printPhoneVersion(int clientDeviceYear, int clientOs) {
        int currentYear = LocalDate.now().getYear();

        if (clientOs == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Ваша операционная система Android, установите облегченную версию приложения по ссылке");
            } else {
                System.out.println("Ваша операционная система Android, установите обычную версию приложения по ссылке");
            }

        } else if (clientOs == 0){
            if (clientDeviceYear < currentYear) {
                System.out.println("Ваша операционная система IOS, установите облегченную версию приложения по ссылке");
            } else {
                System.out.println("Ваша операционная система IOS, установите обычную версию приложения по ссылке");
            }
        }
    }

    public static void task2() {
        System.out.println("Задача № 2.");

        int clientOs = 0; // (0 — iOS, 1 — Android)
        int clientDeviceYear = 2023;

        printPhoneVersion(clientDeviceYear, clientOs);

        printSymbol();
    }


    public static int calculateDaysDelivery(int deliveryDistance) {
        int deliveryDay = 1;

        if (deliveryDistance > 100) {
            return -1;
        }

        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        return deliveryDay;
    }


    public static void task3() {
        System.out.println("Задача № 3.");

        int deliveryDistance = 170;
        int result = calculateDaysDelivery(deliveryDistance);

        if (result == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней для доставки: " + result);
        }

        printSymbol();
    }
}
