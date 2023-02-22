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
        int a = 40000;
        System.out.println("Значение переменной a с типом int равно 40000");
        byte b = 40;
        System.out.println("Значение переменной b с типом byte равно 40");
        short c = 4000;
        System.out.println("Значение переменной c с типом short равно 4000");
        long d = 400000000;
        System.out.println("Значение переменной d с типом long равно 400000000");
        float e = 40.4f;
        System.out.println("Значение переменной e с типом float равно 40.4f");
        double f = 40.4444;
        System.out.println("Значение переменной f с типом double равно 40.4444");
    }
        public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
       }
        public static void task3() {
        System.out.println("Задача 3");
        byte a = 23;
        byte b = 27;
        byte c = 30;
        short d = 480;
        int e = d/(a+b+c);
        System.out.println("На каждого ученика рассчитано " + e + " листов бумаги");}


        public static void task4() {
        System.out.println("Задача 4");
        short a = 16/2;
        System.out.println(a + " бутылок прозводится в минуту");
        short b = 20;
        short c = 24*60;
        System.out.println(c + " колличество минут в сутках");
        short d = 3*24*60;
        System.out.println(d + " колличество минут в 3 днях");
        int e = 30*24*60;
        System.out.println(e + " колличество минут в месяце");
        int f = a*b;
        System.out.println("За 20 минут машина произвела " + f + " штук бутылок");
        int g = a*c;
        System.out.println("За сутки машина произвела " + g + " штук бутылок");
        int h = a*d;
        System.out.println("За 3 дня машина произвела " + h + " штук бутылок");
        int j = a*e;
        System.out.println("За месяц машина произвела " + j + " штук бутылок");}

        public static void task5() {
        System.out.println("Задача 5");
        byte a = 120;
        System.out.println(a + " общее колличество краски");
        byte b = 4;
        System.out.println(b + " нужно банок коричневой краски");
        byte c = 2;
        System.out.println(c + " нужно банок белой краски");
        int d = a/(b+c);
        System.out.println(d + " колличество классов");
        int e = d*b;
        System.out.println(e + " общее колличество коричневой краски");
        int f = d*c;
        System.out.println(f + " общее колличество белой краски");
        System.out.println("В школе, где " + d + " классов, нужно " + f + " банок белой краски и " + e + " банок коричневой краски");}

        public static void task6() {
            System.out.println("Задача 6");
            int a = 5;
            System.out.println(a + " штук бананов");
            int b = 200;
            System.out.println(b + " мл молока");
            int c = 2;
            System.out.println(c + " брикета мороженого");
            int d = 100;
            System.out.println(d + " грамм брикета");
            int e = 4;
            System.out.println(e + " яица");
            int f = 70;
            System.out.println(f + " грамм в одном яице");
            int g = 80;
            System.out.println(g + " грамм в одном банане");
            double h = b * 1.05;
            System.out.println(h + " грамм молока из объема в 200 мл");
            double summa = (a*g+h+c*d+e*f)/1000;
            System.out.println(summa + " общий вес в кг");

            }
        public static void task7() {
        int allWeight = 7;
        int a = 250;
        System.out.println(a + " грамм потери веса при долгом похудении");
        int b = 500;
        System.out.println(b + " грамм потери веса при быстром похудении");
        float c = a/1000f;
        System.out.println(c + " кг потери веса при долгом похудении");
        float d = b/1000f;
        System.out.println(d + " грамм потери веса при быстром похудении");
        double e = allWeight/c;
        System.out.println(e + " дней для сброса веса, при долгом похудении");
        double f = allWeight/d;
        System.out.println(f + " дней для сброса веса при быстром похудении");
        double g = (e + f)/2;
        System.out.println(g + " среднее колличество дней при похудении");}
        public static void task8() {
        int a = 67760;
        System.out.println(a + " зарплата Маши до повышения");
        int b = 83690;
        System.out.println(b + " зарплата Дениса до повышения");
        int c = 76230;
        System.out.println(c + " зарплата Кристины до повышения");
        double d = a*1.1;
        System.out.println(d + " зарплата Маши после повышения");
        double e = b*1.1;
        System.out.println(e + " зарплата Дениса после повышения");
        double f = c*1.1;
        System.out.println(f + " зарплата Кристины после повышения");
        double g = (d-a)*12;
        System.out.println(g + " - увеличение годового дохода Маши");
        double h = (e-b)*12;
        System.out.println(h + " - увеличение годового дохода Дениса");
        double i = (f-c)*12;
        System.out.println(i + " - увеличение годового дохода Кристины");}










}