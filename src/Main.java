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
        int apple;
        byte cap;
        short dog;
        long map;
        float km;
        double kg;

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


    }
    public static void task5() {

    }
    public static void task6() {

    }
    public static void task7() {

    }
}