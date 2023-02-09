public class Main {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task0() {
        int apple = 23234532;
        byte cap = 2;
        short dog = 23445;
        long map = 989987689979L;
        float km = 2.846f;
        double kg = 6.76789;
        System.out.println("Значение переменной с типом int равно " + apple);
        System.out.println("Значение переменной с типом byte равно " + cap);
        System.out.println("Значение переменной с типом short равно " + dog);
        System.out.println("Значение переменной с типом long  равно " + map);
        System.out.println("Значение переменной с типом float равно " + km);
        System.out.println("Значение переменной с типом double равно " + kg);



    }

    public static void task1() {
        int apples = 27897;
        byte box = 67;
        short cars = 569;
        short cup = -159;
        long dots = 987_678_965_549L;
        float kg = 27.12F;
        double ml = 2.786;
    }

    public static void task2() {
        byte ludmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA =30;
        short paper = 480;
        short eachStudent = (short) (paper / (ludmilaP + annaS + ekaterinaA));
        System.out.println(" На каждого ученика рассчитано " + eachStudent + " листов бумаги.");



    }
    public static void task3() {
        byte production = 2;
        byte bottle = 16;
        byte perfomance = (byte) ((byte) bottle / production);
        byte minuteInHour = 60;
        short inDayHour = 24;
        byte dayInMonth = 30;

        byte inMinute = 20;
        short perMinut = (short) (inMinute * perfomance);
        System.out.println("За " + inMinute + " минут машина произвела " + perMinut + " штук бутылок");

        byte inDay = 1;
        short minuteInDay = (short) (inDay * inDayHour * minuteInHour);
        short perDay = (short) (minuteInDay * perfomance);
        System.out.println("За " + inDay + " день машина произвела " + perDay + " штук бутылок");

        short threeDays = 3;
        int perThreeDays = (int) (threeDays * inDayHour * minuteInHour * perfomance);
        System.out.println("За " + threeDays + " дня машина произвела " + perThreeDays + " штук бутылок");

        byte month = 1;
        int perMonth = dayInMonth * inDayHour * minuteInHour * perfomance;
        System.out.println("За " + month + " месяц машина произвела " + perMonth + " штук бутылок");




    }
    public static void task4() {
         byte colors = 120;
         byte white = 2;
         byte brown = 4;
         byte cabinet = (byte) ((byte) colors / (white + brown));
         byte whitePic = (byte) (cabinet * white);
         byte brownPic = (byte) (cabinet * brown);
        System.out.println("В школе, где " + cabinet + " классов, нужно " + whitePic + " банок белой краски и " + brownPic + " банок коричневой краски");

    }
    public static void task5() {
        byte banana = 5;
        byte bananaWeight = 80;
        short bananas = (short) (bananaWeight * banana);

        byte milkMl = 2;
        byte milkG = 105;
        short milkWeight = (short) (milkG * milkMl);

        byte iceCream = 2;
        byte iceCreamWeight = 100;
        short iceCreamG = (short) (iceCream * iceCreamWeight);

        byte egg = 4;
        byte eggWeight = 70;
        short eggs = (short) (egg * eggWeight);

        short totalG = (short) (bananas + milkWeight + iceCreamG + eggs);
        short grPerKg = 1000;
        float totalKg = (float) (totalG / grPerKg);
        System.out.println("Колличетво грамм " + totalG + ", а киллограмм " + totalKg );

    }
    public static void task6() {
        byte loseKg = 7;
        short grInKg = 1000;
        short loseFrom = 250;
        short loseTo = 500;
        short dayFrom = (short) (loseKg * grInKg / loseFrom);
        short dayTo = (short) (loseKg * grInKg / loseTo);
        System.out.println("При потере " + loseFrom + " гр в день, потребуется " + dayFrom + " дней, а при " + loseTo + " гр, вес уйдет за " + dayTo + " дней."
        );


    }
    public static void task7() {
        float increase =  0.10f;
         byte monthYear = 12;
         int masha = 67760;


        float increaceM = (float) (masha * monthYear * increase);
         float differenceM = (float) (increaceM / increase);
         System.out.println("Маша теперь получает " + differenceM + " рублей. Годовой доход вырос на " + increaceM + " рублей");
        int denis = 83690;
       float increaseD = denis * monthYear * increase;
         float differenceD = (float) (increaseD / increase);
        System.out.println("Денис теперь получает " + differenceD + " рублей. Годовой доход вырос на " + increaseD + " рублей");
        int kris = 76230;
        float increaseK = (float) (kris * monthYear * increase);
         float differenceK = (float) (increaseK / increase);
        System.out.println("Кристина теперь получает " + differenceK + " рублей. Годовой доход вырос на " + increaseK + " рублей");


    }
}