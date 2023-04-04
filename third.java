package hw_java6;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        first l1 = new first(1, 2, 128, "Windows 10", "Black");
        first l2 = new first(2, 4, 256, "Windows 11", "Yellow");
        first l3 = new first(3, 32, 512, "Windows 10", "White");

        System.out.println("Выберите функцию:");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по SSD");
        System.out.println("3 - сортировка по OS");
        Scanner sc = new Scanner(System.in, "ibm866");
        Integer choice = sc.nextInt();
        if (choice == 1) {

            System.out.printf("Введите значение ОЗУ: ");
            Integer ram = sc.nextInt();
            if (ram >= 32) {
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l3.toString() + "\n");
            } else if (ram < 32) {
                System.out.printf(l1.toString() + "\n" + l2.toString());
            } else if (ram < 16) {
                System.out.printf(l1.toString() + "\n" + l2.toString());
            } else if (ram < 4) {
                System.out.printf(l1.toString());
            } else
                System.out.println("Отсутствуют");

        } else if (choice == 2) {
            System.out.printf("Введите значение SSD: ");
            Integer ssd = sc.nextInt();
            if (ssd >= 512) {
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l3.toString() + "\n");
            } else if (ssd < 512) {
                System.out.printf(l1.toString() + "\n" + l2.toString());
            } else if (ssd < 256) {
                System.out.printf(l1.toString() + "\n" + l2.toString());
            } else if (ssd < 128) {
                System.out.printf(l1.toString());
            } else
                System.out.println("Отсутствуют");

        } else if (choice == 3) {

            System.out.println("Введите название OS");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if (os.equals("Windows")) {
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l3.toString() + "\n");
            } else if (os.equals("Windows 10")) {
                System.out.printf(l1.toString() + "\n" + l3.toString());
            } else if (os.equals("Windows 11")) {
                System.out.printf(l2.toString());
            } else
                System.out.println("Отсутствуют");
            sc1.close();
        }

        sc.close();

    }
}