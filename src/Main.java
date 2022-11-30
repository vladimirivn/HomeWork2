public class Main {
    public static void main(String[] args) {

        // ДЗ1 Задача 1
        System.out.println("----Домашнее задание 1 Задача 1----");

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // ДЗ1 Задача 2
        System.out.println("----Домашнее задание 1 Задача 2----");

        dog +=4;
        cat +=4;
        paper +=4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        // ДЗ1 Задача 3
        System.out.println("----Домашнее задание 1 Задача 3----");
        var dog1 = 8.0;
        dog1 -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog1);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("----Домашнее задание 2 Задача 4----");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        System.out.println("----Домашнее задание 2 Задача 5----");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        System.out.println("----Домашнее задание 3 Задача 6----");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        System.out.println("Общий вес = " + (weightBoxer1 + weightBoxer2));
        var weightDifference = Math.abs(weightBoxer1 - weightBoxer2);
        System.out.println("Разница в весе = " + weightDifference);

        System.out.println("----Домашнее задание 3 Задача 7----");
        var weightDifference1 = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе 1й вариант = " + weightDifference1);
        weightDifference1 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница в весе 2й вариант = " + weightDifference1);

    }
}