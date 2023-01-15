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

    public static void task1 () {
        System.out.println("Задача 1");
        byte stick = 10;
        System.out.println("Значение переменной stick типом byte равно " + stick);
        short apples = 10000;
        System.out.println("Значение переменной apples типом short равно " + apples);
        int bit = 1000000;
        System.out.println("Значение переменной bit типом int равно " + bit);
        long dollars = 10000000000000L;
        System.out.println("Значение переменной dollars типом long равно " + dollars);
        float temperature = 36.6F;
        System.out.println("Значение переменной temperature типом float равно " + temperature);
        double pi = 3.145_678_966;
        System.out.println("Значение переменной pi типом double равно " + pi);


    }

    public static void task2 () {
        System.out.println("Задача 2");

    float a = 27.12F;
    long b = 987_678_965_549L;
    double c = 2.786;
    short d = 569;
    short e = -159;
    short f = 27897;
    byte g = 67;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);

    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte luda = 23;
        byte anna = 27;
        byte katya = 30;
        int allChildren = luda + anna + katya;
        short allPaper = 480;
        System.out.println("На каждого ученика рассчитано "+ allPaper / allChildren + " листов бумаги.");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        System.out.println("Машина производит 16 бутылов в 2 минуты");
        byte minute = 8;
        int twenty = minute * 20;
        System.out.println("Машина за 20 минут произведет " + twenty + " бутылочек.");
        int day =  minute * 60 * 12;
        System.out.println("Машина произведет за день " + day + " бутылок.");
        int threeDays = day * 3;
        System.out.println("Машина произвела за 3 дня "+ threeDays + " бутылок.");
        int mounth = day * 30;
        System.out.println("Машина произвела за месяц " + mounth + " бутылей.");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte allColor = 120;
        byte white = 2;
        byte brown = 4;
        int classes = allColor / (white+brown);
        int allWhite = classes * white;
        int allBrown = classes * brown;
        System.out.println("В школе, где " + classes + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");

    }
    public static void task6 ()
    {
        System.out.println("Задача 6");
        byte banana = 5;
        int milk = 200;
        byte ice = 2;
        byte eggs = 4;
        int allBananasGramms = banana * 80;
        float allMilkGramms = milk * 1.05F;
        int allIceGramms = ice * 100;
        int allEggsGramms = eggs * 70;
        float gramms = allEggsGramms+allBananasGramms+allIceGramms+allMilkGramms;
        float kg = gramms / 1000;
        System.out.println(" У нас выйдет такой смеси " + gramms+ " в граммах и " +kg+ " килограмм");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int allGramms = 7000;
        int lightDay = 250;
        int hardDay = 500;
        int allLightDays = allGramms / lightDay;
        int allHardDays = allGramms / hardDay;
        int SredneDays = (allHardDays+allLightDays) / 2;
        System.out.println(" Если спортсмен будет терять 250 грамм, то он потеряет 7кг за " + allLightDays + " дней, а если по 500 грамм, то за " + allHardDays + " дней. А в среднем потребуется дней эдак - "+ SredneDays + " дней.");


    }
    public static void task8 () {
        System.out.println("Задача 8");
    }
}