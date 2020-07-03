package ru.geekbrains.home_work_;

public class GB {

    public static void main(String[] args) {
        byte a = -100;
        short b = 22456;
        int c = 300000;
        long d = 100L;
        float e = 12.34F;
        double f = 123.45D;
        char j = '*';
        boolean i = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(j);
        System.out.println(i);
    }

    public static int calculation(int a, int b, int c, int d) {

        return a * (b + (c / d));
    }

    public static int sum(int a, int b) {
        int c;
        c = (c >= 10 && c <= 20);

        return c;
    }

    public static int positiveNumber(int num) {
        if (num < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean getNumber(int number) {
        boolean result = (number < 0);
        return result;
    }

    public static void helloName(String name) {
        System.out.println("Привет, " + name);
    }
}

