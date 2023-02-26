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
        int potato = 1300000;
        System.out.println("Значение переменной potato с типом int равно " + potato);
        byte tomato = 12;
        System.out.println("Значение переменной tomato с типом byte равно " + tomato);
        short grapes = 32333;
        System.out.println("Значение переменной grapes с типом short равно " + grapes);
        long sugar = 1000000000L;
        System.out.println("Значение переменной sugar с типом long равно " + sugar);
        float salt = 23.5555555f;
        System.out.println("Значение переменной salt с типом float равно " + salt);
        double water = 11.999999;
        System.out.println("Значение переменной water с типом double равно " + water);


    }

    public static void task2() {
        System.out.println("Задача 2");
        byte a = 67;
        short b = 569;
        short d = -159;
        short c = 27897;
        long e = 987678965549L;
        float f = 2.786f;
        double g = 27.12;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte studentsLudmila = 23;
        byte studentsAnna = 27;
        byte studentsEkaterina = 30;
        int totalStudents = studentsEkaterina + studentsAnna + studentsLudmila;
        short paper = 480;
        int studentsPaper = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + studentsPaper + " листов бумаги");

    }

    public static void task4() {
        System.out.println("Задача 4");
        byte productivityTwoMin = 16;
        int productivityOneMin = (productivityTwoMin / 2);
        int productivityOneHour = productivityOneMin * 60;
        int productivityTwentyMin = productivityOneMin * 20;
        System.out.println("За 20 минут машина произвела " + productivityTwentyMin + " штук бутылок");
        int productivityOneDay = productivityOneHour * 24;
        System.out.println("За сутки машина произвела " + productivityOneDay + " штук бутылок");
        int productivityThreeDays = productivityOneDay * 3;
        System.out.println("За три дня машина произвела " + productivityThreeDays + " штук бутылок");
        int productivityOneMonth = productivityOneDay * 30;
        System.out.println("За месяц машина произвела " + productivityOneMonth + " штук бутылок");

        /* нужно ли тут вводить переменную вроде minPerHour = 60?
        и далее hourPerDay = 24 , dayPerMonth = 30?
         */


    }

    public static void task5() {
        System.out.println("Задача 5");
        byte totalJar = 120;
        byte colorWhiteJar = 2;
        byte colorBrownJar = 4;
        int jarOneRoom = colorBrownJar + colorWhiteJar;
        int totalRoom = totalJar / jarOneRoom;
        int totalColorWhite = totalRoom * colorWhiteJar;
        int totalColorBrown = totalRoom * colorBrownJar;
        System.out.println("В школе, где " + totalRoom + " классов, нужно " + totalColorWhite + " банок белой краски и "
                + totalColorBrown + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte banana = 5;
        byte weightBanana = 80;
        int totalBanana = banana * weightBanana;
        short milk = 200;
        byte weightMilk = 105;
        int totalMilk = milk * weightMilk;
        byte iceCream = 2;
        byte weightIceCream = 100;
        int totalIceCream = iceCream * weightIceCream;
        byte egg = 4;
        byte weightEgg = 70;
        int totalEgg = egg * weightEgg;
        int weightBreakfast = totalEgg + totalBanana + totalIceCream + totalMilk;
        int grPerKg = 1000;
        float weightBreakfastKilo = weightBreakfast / (float) grPerKg;
        System.out.println(weightBreakfastKilo);
    }

    public static void task7() {
        System.out.println("Задача 7");
        byte weightLose = 7;
        short firstDiet = 250;
        int firstResult = weightLose * 1000 / firstDiet;
        System.out.println(firstResult);
        short secondDiet = 500;
        int secondResult = weightLose * 1000 / secondDiet;
        System.out.println(secondResult);
        int middleResult = firstResult / 2 + secondResult / 2;
        System.out.println(middleResult);
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salaryMariaMonth = 67760;
        int salaryMariaAddition = salaryMariaMonth * 10 / 100;
        int salaryMariaNew = salaryMariaMonth + salaryMariaAddition;
        int salaryMariaYearOld = salaryMariaMonth * 12;
        int salaryMariaYearNew = salaryMariaNew * 12;
        int salaryMariaYearDiff = salaryMariaYearNew - salaryMariaYearOld;
        System.out.println("Маша теперь получает " + salaryMariaNew + " рублей. Годовой доход вырос на "
                + salaryMariaYearDiff + " рублей");
        int salaryDenisMonth = 83690;
        int salaryDenisAddition = salaryDenisMonth * 10 / 100;
        int salaryDenisNew = salaryDenisMonth + salaryDenisAddition;
        int salaryDenisYearOld = salaryDenisMonth * 12;
        int salaryDenisYearNew = salaryDenisNew * 12;
        int salaryDenisYearDiff = salaryDenisYearNew - salaryDenisYearOld;
        System.out.println("Денис теперь получает " + salaryDenisNew + " рублей. Годовой доход вырос на "
                + salaryDenisYearDiff + " рублей");
        int salaryKristinaMonth = 76230;
        int salaryKristinaAddition = salaryKristinaMonth * 10 / 100;
        int salaryKristinaNew = salaryKristinaMonth + salaryKristinaAddition;
        int salaryKristinaYearOld = salaryKristinaMonth * 12;
        int salaryKristinaYearNew = salaryKristinaNew * 12;
        int salaryKristinaYearDiff = salaryKristinaYearNew - salaryKristinaYearOld;
        System.out.println("Кристина теперь получает " + salaryKristinaNew + " рублей. Годовой доход вырос на "
                + salaryKristinaYearDiff + " рублей");

    }

}