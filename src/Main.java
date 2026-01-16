//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte q = 101;
        System.out.println("Значение переменной q с типом byte равно " + q);
        short w = -31113;
        System.out.println("Значение переменной w с типом short равно " + w);
        int e = 100777;
        System.out.println("Значение переменной e с типом int равно " + e);
        long r = 4555981545L;
        System.out.println("Значение переменной r с типом long равно " + r);
        float t = 4.5983F;
        System.out.println("Значение переменной t с типом float равно " + t);
        double y = 25.375295752d;
        System.out.println("Значение переменной y с типом double равно " + y);
    }

    public static void task2() {
        System.out.println("Задача 2");
        double a = 27.12d;
        System.out.println("Значение переменной " + a + ",будет double");
        long s = 987678965549L;
        System.out.println("Значение переменной " + s + ",будет long");
        float d = 2.786F;
        System.out.println("Значение переменной " + d + ",будет float");
        short h = 569;
        System.out.println("Значение переменной " + h + ",будет short");
        short j = -159;
        System.out.println("Значение переменной " + j + ",будет short");
        int g = 27897;
        System.out.println("Значение переменной " + g + ",будет int");
        byte f = 67;
        System.out.println("Значение переменной " + f + ",будет byte");
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte student1 = 23;
        byte student2 = 27;
        byte student3 = 30;
        short paper = 480;
        int totalStudent = student1 + student2 + student3;
        int paperFor1 = paper / totalStudent;
        System.out.println("На каждого ученика рассчитано " + paperFor1 + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte minutes = 2;
        int minutes1 = bottle / minutes;
        int minutes20 = 20 * minutes1;
        System.out.println("За 20 минут машина произвела " + minutes20 + " штук бутылок");
        int minutesInHour = 24 * 60;
        int day = minutesInHour * minutes1;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int day3 = day * 3;
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        int mounth = 30 * day;
        System.out.println("За месяц машина произвела " + mounth + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte potWhite = 2;
        byte potBrown = 4;
        byte potTotal = 120;
        int potPerClassroom = potWhite + potBrown;
        int classroom = potTotal / potPerClassroom;
        int potWhiteOnClassroom = potWhite * classroom;
        int potBrownOnClassroom = potBrown * classroom;
        System.out.println("В школе, где " + classroom + " классов, нужно " + potWhiteOnClassroom + " банок белой краски и " + potBrownOnClassroom + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        short bananas = 80 * 5;
        short milk = 105 * 2;
        short icecream = 100 * 2;
        short egg = 70 * 4;
        int weightG = bananas + milk + icecream + egg;
        int grPerKg = 1000;
        float weightKg = weightG / (float) grPerKg;
        System.out.println("Вес спортзавтрака в граммах равен " + weightG + " ,а в килограммах равен " + weightKg);

    }

    public static void task7() {
        System.out.println("Задача 7");
        short weightKg = 7;
        int grPerKg = 1000;
        int weightG = weightKg * grPerKg;
        short weightLoss1 = 250;
        short weightLoss2 = 500;
        int day1 = weightG / weightLoss1;
        int day2 = weightG / weightLoss2;
        System.out.println("Если сбрасывать по 250гр в день, то потребуется " + day1 + "дней, а если по 500гр, то " + day2 + " дней.");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float salaryIncrease = 1.1F;
        float newSalaryMasha = salaryMasha * salaryIncrease;
        float newSalaryDenis = salaryDenis * salaryIncrease;
        float newSalaryKristina = salaryKristina * salaryIncrease;
        byte year = 12;
        float yearSalaryDiffMasha = (newSalaryMasha - salaryMasha) * year;
        float yearSalaryDiffDenis = (newSalaryDenis - salaryDenis) * year;
        float yearSalaryDiffKristina = (newSalaryKristina - salaryKristina) * year;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + yearSalaryDiffMasha + "рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearSalaryDiffDenis + "рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + yearSalaryDiffKristina + "рублей.");


    }


}