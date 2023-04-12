public class VariablesTheme {   

    public static void main(String[] args) {
        System.out.println("1 Вывод значений переменных на консоль");

        byte name = 5;
        short name_1 = 32500;
        int name_2 = 23123123;
        long name_3 = 1231923213;
        float name_4 = 32.14f;
        double name_5 = 33.1515d;
        char name_6 = 'A';
        boolean name_7 = false;
        System.out.print(name);
        System.out.println(" - Целое число");
        System.out.print(name_1);
        System.out.println(" - Целое число");
        System.out.print(name_2);
        System.out.println(" - Целое число");
        System.out.print(name_3);
        System.out.println(" - Целое число");
        System.out.print(name_4);
        System.out.println(" - Вещественное число");
        System.out.print(name_5);
        System.out.println(" - Вещественное число, двойной точности");
        System.out.print(name_6);
        System.out.println(" - Символ");
        System.out.print(name_7);
        System.out.println(" - Логическое значение \n");
        
        System.out.println("2 Расчет стоимости товара со скидкой \n");
        int item1 = 200, item2 = 100;
        int sales = item1 + item2;
        System.out.println(sales);
        int sales1 = sales / 100 * 11;
        System.out.println(sales1);
        int sales2 = sales - sales1;
        System.out.println(sales2);
        
        System.out.println("3 Вывод слова JAVA");
        System.out.println("   J     a   v     v   a");
        System.out.println("   J    a a   v   v   a a");
        System.out.println("J  J   aaaaa   V V   aaaaa");
        System.out.println(" JJ   a     a   V   a     a\n");
        
        System.out.println("4 Вывод min и max значений целых числовых типов");
        byte byt = 5;
        System.out.println(byt);
        byt++;
        System.out.println(byt);
        byt--;
        System.out.println(byt);
        short sho = 42;
        System.out.println(sho);
        sho++;
        System.out.println(sho);
        sho--;
        System.out.println(sho);
        int in = 12_345;
        System.out.println(in);
        in++;
        System.out.println(in);
        in--;
        System.out.println(in);
        long lon = 1_122_334_445;
        System.out.println(lon);
        lon++;
        System.out.println(lon);
        lon--;
        System.out.println(lon);
        
        System.out.println("5 Перестановка значений переменных");
        System.out.println("#1. с помощью третьей переменной");
        int digi1 = 2;
        int digi2 = 5;
        System.out.println(digi1);
        System.out.println(digi2);
        System.out.printf("digi1 = %s digi2 = %s\n", digi1, digi2);
        int temp;
        temp = digi2;
        digi2 = digi1;
        digi1 = temp;
        System.out.printf("digi1 = %s digi2 = %s\n", digi1, digi2);
        System.out.println("#.2 с помощью арифметических операций");
        digi2 = digi2 + digi1;
        digi1 = digi2 - digi1;
        digi2 = digi2 - digi1;
        System.out.printf("digi1 = %s digi2 = %s\n", digi1, digi2);
        digi2 = digi2 + digi1;
        digi1 = digi2 - digi1;
        digi2 = digi2 - digi1;
        System.out.printf("digi1 = %s digi2 = %s\n", digi1, digi2);
        System.out.println("#.3 с помощью побитовой операции");
        digi2 = digi2^digi1;
        digi1 = digi2^digi1;
        digi2 = digi2^digi1; 
        System.out.printf("digi1 = %s digi2 = %s\n", digi1, digi2);
        digi2 = digi2^digi1;
        digi1 = digi2^digi1;
        digi2 = digi2^digi1;
        System.out.printf("digi1 = %s digi2 = %s\n", digi1, digi2);
        
        System.out.println("6 Вывод символов и их кодов");
        char hashTag = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.printf("%c %s\n %c %s\n %c %s\n %c %s\n %c %s\n", hashTag, (int)hashTag,
        ampersand, (int)ampersand, at, (int)at, caret, (int)caret, underscore, (int)underscore);
        
        System.out.println("7 Вывод в консоль ASCII-арт Дюка");
        char slash = 47;
        char baskSlash = 92;
        char lbbrk = 40;
        char rbbrk = 41;
        System.out.printf("     %c%c     \n    %c  %c    \n", slash, baskSlash, slash, baskSlash);
        System.out.printf("   %c%c%c %c%c \n  %c      %c \n %c%c%c%c%c%c%c%c%c%c \n", slash, 
        underscore, lbbrk, rbbrk, baskSlash, slash, baskSlash, slash, underscore, underscore,
        underscore, underscore, slash, baskSlash, underscore, underscore, baskSlash);
        
        System.out.println("8 Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int number1 = (number / 100);
        int number2 = (number % 100 / 10);
        int number3 = (number % 100 % 20);
        System.out.printf("Число 123 содержит:\n %d сотню\n %d десятков\n %d единицы\n", number1,
        number2, number3);
        int digit1 = 1; 
        int digit2 = 2;
        int digit3 = 3; 
        int sim = digit1 + digit2 + digit3;
        System.out.printf("Сумма его цифр: %d\n", sim);
        int sim1 = digit1 * digit2 * digit3;
        System.out.printf("Произведение: %d\n", sim1);
        
        System.out.println("9 Вывод времени");
        int time = (86399 / 3600) % 24;
        int min = (86399 / 60) % 60;
        int sec = 86399 % 60;
        System.out.printf(" ЧЧ%d:MM%d:CC%d\n", time, min, sec);
    }
}