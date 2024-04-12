import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
//        task12();
//        task12_1();
//        task13();
//        task14();
//        task15();
//        task16();
//        task17();
//        task18();
//        taskArray1();
//        taskArray2();
//        taskArray2_2();
    }

    /**
     * Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
     * У Людмилы Павловны— 23 ученика , у Анны Сергеевны— 27 учеников, у Екатерины Андреевны— 30 учеников.
     * Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте,
     * сколько достанется листов каждому ученику.
     * Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
     */
    public static void task1() {
        int oneClass = 23;
        int twoClass = 27;
        int threeClass = 30;
        int totalPapers = 480;
        int totalStudent = oneClass + twoClass + threeClass;
        totalPapers = totalPapers / totalStudent;
        System.out.println("Каждому ученику достанется по " + totalPapers + " лист(-ов) бумаги.");
    }

    /**
     * Производительность машины для изготовления бутылок— 16 бутылок за 1 минуту.
     * Какая производительность машины будет:
     * - за 20 минут,
     * - в сутки,
     * - за 3 дня,
     * - за 1 месяц?
     */
    public static void task2() {
        int bootleInMinute = 16;
        int minuteInHour = 60;
        int hourInOneDay = 24;
        int bottleInTwentyMinute = bootleInMinute * 20;
        int bottleInOneDay = bootleInMinute * (minuteInHour * hourInOneDay);
        int bottleInThreeDays = bottleInOneDay * 3;
        int bottleInOneMonth = bottleInOneDay * 30;
        System.out.println("За 20 минут, машина произвела: " + bottleInTwentyMinute);
        System.out.println("За сутки, машина произвела: " + bottleInOneDay);
        System.out.println("За 3 дня, машина произвела: " + bottleInThreeDays);
        System.out.println("За 1 месяц, машина произвела: " + bottleInOneMonth);
    }

    /**
     * На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит
     * 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
     * Выведите результат задачи в консоль в формате: «В школе, где … классов,
     * нужно … банок белой краски и … банок коричневой краски».
     */

    public static void task3() {
        int allClass = 120 / 6;
        int whitePaint = allClass * 2;
        int brownPain = allClass * 4;
        System.out.println("В школе, где " + allClass + " классов, нужно: " + whitePaint
                + " банок белой краски и " + brownPain + " коричневой краски.");
    }

    /**
     * У банка появилось мобильное приложение. Поэтому теперь, когда пользователь заходит на сайт с телефона,
     * ему предлагается скачать приложение с учетом того, какая операционная система у пользователя.
     * Напишите программу, которая определяет, чем пользуется клиент (iOS или Android),
     * и выдает соответствующее сообщение:
     * Для iOS — «Установите версию приложения для iOS по ссылке».
     * Для Android — «Установите версию приложения для Android по ссылке».
     * Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).
     */

    public static void task4() {
        int clientOS = 7;
        int clientDeviceYear = 2015;
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Такой операционной системы нет");
            return;
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015)
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015)
            System.out.println("Установите обычную версию приложения для Android по ссылке");
    }

    /**
     * Напишите программу, которая определяет, является ли год високосным или нет.
     * Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
     * Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
     * « …. год является високосным» или «... год не является високосным».
     * Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
     * Также високосным является каждый четырехсотый год.
     */
    public static void task5() {
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год является високосным");
        } else
            System.out.println(year + " Год НЕ является високосным");
    }

    /**
     * Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц
     * принадлежит. Например, 1-й месяц (он же январь) принадлежит к сезону зима.
     * Для написания программы используйте оператор switch. Для обозначения номера месяца
     * используйте переменную monthNumber = 12.
     * Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).
     */

    public static void task6() {
        int monthNumber = 9;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Такого месяца нет");
        }
    }

    /**
     * Выведите в консоль все четные числа от 0 до 17.
     * Четными числами считаются числа, которые делятся на 2 без остатка.
     * В нашем случае к нулю нужно прибавлять 2, тогда все числа будут четными.
     */

    public static void task7() {
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.print(i + " ");
            }
        }
        for (int j = 0; j <= 17; j += 2) {
            System.out.println(j);
        }
    }

    /**
     * Напишите программу, которая выводит в консоль последовательность чисел:
     * 1 2 4 8 16 32 64 128 256 512
     */

    public static void task8() {
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
    }

    /**
     * Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете
     * откладывать по 29 000 рублей «в банку».
     * Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц…,
     * сумма накоплений равна… рублей».
     */
    public static void task9() {
        int sum = 29_000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total += sum;
            System.out.println("Месяц " + month + " сумма накоплений равна = " + total);
        }
        System.out.println("Общая сумма накоплений " + total);
    }

    /**
     * Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку»,
     * а в банк под проценты— 12% годовых. Выведите сумму накоплений за каждый месяц
     * в консоль в формате: «Месяц…, сумма накоплений равна… рублей».
     * 12% годовых— 1% от суммы каждый месяц.
     */
    public static void task10() {
        double sum = 29_000;
        double total = 0;
        double rate = 1.01;
        for (int month = 1; month <= 12; month++) {
            total = total * rate + sum;
            System.out.printf("Месяц %d сумма накоплений %.2f рублей \n", month, total);
        }
    }

    /**
     * Напишите программу, которая выводит в консоль таблицу умножения на 2
     */
    public static void task11() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + i * 2);
        }
    }

    public static void task12() {
        int days = 10; // изначальное количество дней в Париже

        if (days == 0) {
            System.out.println("Желаем приятной поездки!");
        } else {
            while (days > 0) {
                days--;
                System.out.println("До конца поездки осталось " + days + " дней.");
            }
            System.out.println("Путешествие окончено. Пора возвращаться домой.");
        }
    }

    public static void task12_1() {
        System.out.println("Задача 12.1");
        for (int days = 10; days > 0; days--) {
            if (days == 0) {
                System.out.println("Желаем приятной поездки");
            } else
                System.out.println("До конца поездки осталось " + days + " дней.");
        }
        System.out.println("Путешествие окончено. Пора возвращаться домой.");
    }

    /**
     * Продолжите работать с кодом, который вы написали в предыдущем уроке— в задачах с накоплениями.
     * С помощью цикла while посчитайте, сколько месяцев потребуется,
     * чтобы накопить 2_459_000 рублей при условии, что первоначально мы имеем 0 рублей
     * и готовы откладывать по 15 тысяч рублей.
     * Результат программы должен быть выведен в консоль с тем количеством месяцев,
     * которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .
     */
    public static void task13() {
        int deposit = 15_000;
        int totalMoney = 2_459_000;
        int total = 0;
        int month = 0;
        while (total <= totalMoney) {
            month++;
            total += deposit;
            System.out.println("Месяцев - " + month + " сумма " + total);
        }
    }

    /**
     * В стране Y население равно 12 миллионов человек.
     * Рождаемость составляет 17 человек на 1000 в год, смертность— 8 человек на 1000 в год. Рассчитайте,
     * какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
     * В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
     */
    public static void task14() {
        int population = 12_000_000;
        int peopleInOneYear = (population / 1000 * 17) - (population / 1000 * 8);
        for (int year = 1; year <= 10; year++) {
            population += peopleInOneYear;
            System.out.printf("Год %d , численность населения составляет %d \n", year, population);
        }
    }

    /**
     * Василий решил положить деньги на накопительный счет,
     * где каждый месяц к сумме его вклада добавляется еще 7%.
     * Первоначальная сумма вклада— 15 тысяч рублей.
     * Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
     * чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от
     * накоплений не меняется, а всегда равен 7%.
     * Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
     */

    public static void task15() {
        int deposit = 15_000;
        double rate = 1.07;
        double total = 0;
        int needSum = 12_000_000;
        for (int month = 1; total <= needSum; month++) {
            total = total * rate + deposit;
            System.out.printf("Месяц %d , сумма накоплений %.2f \n", month, total);
        }
    }

    public static void task16() {
        int deposit = 15_000;
        double rate = 1.07;
        double total = 0;
        int needSum = 12_000_000;
        for (int month = 1; total <= needSum; month++) {
            total = total * rate + deposit;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d , сумма накоплений %.2f \n", month, total);
            }
        }
    }

    /**
     * Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать,
     * какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
     * Исходная сумма всё та же— 15 тысяч рублей, проценты банка– 7% ежемесячно.
     * Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
     */
    public static void task17() {
        int deposit = 15_000;
        double rate = 1.07;
        int years = 9;
        int monthInNineYear = 12 * years;
        double total = 0;
        for (int month = 1; month <= monthInNineYear; month++) {
            total = total * rate + deposit;
            if (month % 6 == 0) {
                System.out.printf("Меcяц %d , Сумма накполений: %.2f \n", month, total);
            }
        }
    }

    /**
     * В компании пятница— отчетный день.
     * Нужно написать программу, которая считает дни месяца по датам, определяет,
     * какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
     * Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
     * Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
     * «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
     * В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений
     * с напоминаниями по разным датам.
     */
    public static void task18() {
        int friday = 4;
        for (int day = 1; day <= 31; day++) {
            if (day == friday) {
                System.out.printf("Сегодня пятница %d число. Необходимо подготовить отчет. \n", day);
                friday += 7;
            }
        }
    }

    /**
     *
     */
    public static void taskArray1() {
        int[] arrInt = {1, 2, 3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        char[] arrChar = {'s', '1', '@'};

        System.out.println(Arrays.toString(arrInt));
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i]);
            if (i != arrInt.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(arrDouble));
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.print(arrDouble[i]);
            if (i != arrDouble.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(arrChar));
        for (int i = 0; i < arrChar.length; i++) {
            System.out.print(arrChar[i]);
            if (i != arrChar.length - 1) {
                System.out.print(" ,");
            }
        }
    }

    public static void taskArray2() {
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void taskArray2_2() {
        int[] arrInteger = {1,2,3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        char[] arrChar = {'$','#','9'};

        System.out.println(Arrays.toString(arrInteger));
        for (int i = 0; i < arrInteger.length; i++) {
            System.out.print(arrInteger[i]);
            if (i != arrInteger.length -1 && i % 2 != 0) {
                arrInteger[i] +=1;
                System.out.print(" , ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arrDouble));
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            System.out.print(arrDouble[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(arrChar));
        for (int i = 0; i < arrChar.length; i++) {
            System.out.print(arrChar[i]);
            if (i != arrChar.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        int[] arr = {5,6,7};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}