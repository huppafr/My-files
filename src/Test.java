import javax.sound.midi.SysexMessage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;




// c++  это  c=c+1
// scan.hasNext() - бесконечный поток ввода данных
// psvm - для быстрого создания public static void main
// sout - System.out.Println
// fori - Вызывает цикл for


/*

*/

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int nums_count = scan.nextInt();
        int [] array = new int[nums_count];
        int length = array.length;
        int counter = 0;
        String slices = "";

        // Заполняем массив значениями
        for (int i = 0; i < nums_count; i++) {
            array[i] = scan.nextInt();
        }

        int last_element = array[array.length-1];
        int penultimate = array[array.length-2];

        for (int i = 0; i < nums_count-1; i++) {
            if (array[i] < array[i+1]){
                slices += (Integer.toString(array[i])); slices += " ";
            }
            if (array[i] > array[i+1]){
                slices += (Integer.toString(array[i]));
                counter++;
                //System.out.println(slices);
                slices="";
            }
        }
        slices="";
        System.out.println(counter);

        for (int i = 0; i < nums_count-1; i++) {
            if (array[i] < array[i+1]){
                slices += (Integer.toString(array[i])); slices += " ";
            }
            if (array[i] > array[i+1]){
                slices += (Integer.toString(array[i]));
                // counter++;
                System.out.println(slices);
                slices="";
            }
        }

        if (penultimate < last_element)
            slices += last_element;



        System.out.println(slices);

        System.out.println("--------------------------------------------------------------");
        System.out.println(penultimate);
        System.out.println(last_element);
        System.out.print(Arrays.toString(array));

        // System.out.print(Arrays.toString(array));
        //System.out.println(Arrays.toString(array));
    }
}



/*

// СТРОКИ !

Методы класса String:

charAt(int index);               // возвращает букву строки по индексу, [] - так нельзя!
length();                        // возвращает длину строки
toUpperCase();                   // приводит строку к верхнему регистру
toLowerCase();                   // приводит строку к нижнему регистру
compareTo(String anotherStr);    // лексикографическое сравнение строк
contains(String str);            // проверяет содержится ли строка внутри строки
startsWith(String str);          // проверяет начинает ли строка на строку
endsWith(String str);            // проверяет заканчивается ли строка на строку
indexOf(String str);             // возвращает позицию первого вхождения подстроки в строку
lastIndexOf(String str);         // возвращает позицию последнего вхождения подстроки в строку
split(regex reg);                // разбивает строку на массив строк по регулярному выражению
toCharArray();                   // возвращает массив с символами
Методы класса StringBuilder, которых нет в классе String:

append(String str);              // вставка в конец за константное время
set(int index, char ch);         // изменение буквы внутри строки
delete(int from, int to);        // удаление куска строки
deleteCharAt(int index);         // удаление символа по индексу
insert(int index, String str);   // вставка строки по индексу
reverse()                        // обратный порядок симовлов

// МАССИВЫ !
// int [] array = new int[100]; // массив на сто целых чисел, по умолчанию все элементы массива заполняются базовыми значениями 0

// Двумерные массивы в Java - это массивы массивов:
//int [][] Array2D = new int[50][100]; // таблица на 50 строк и 100 столбцов

// Сортировка массива
// int [] array = {1, 2, 7, 2, 1, 2, 6, 9};
// Arrays.sort(array);

// ЦИКЛЫ !
// if(a != 4) // а не равно 4
// if(!(a > b)) // а не больше b
// if((a > 7) || (a < -2)) // а меньше -2 или а больше 7
// if(a > 3 && a < 8 && a % 2 == 0) // НЕСКОЛЬКО УСЛОВИЙ СРАЗУ А больше трех, А меньше 8, А - четно.

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt(), j = scan.nextInt(), k = scan.nextInt();
        int max_value = Math.max(Math.max(i, j), k);
        System.out.println(max_value);
        // ПЕРВЫЙ ВАРИАНТ
        if (i > j)
            if (i > k)
                System.out.println(i);
            else
                System.out.println(k);
        else
            if (j > k)
                System.out.println(j);
            else
                System.out.println(k);
        // ВТОРОЙ ВАРИАНТ
       // ТЕРНАРНЫЕ ОПЕРАТОРЫ ПРИСВАИВАНИЯ
        // НЕМНОГ ОПОХОЖЕ НА LIST COMPREHENSION В PYTHON
        int max_value2 = i > j ? i : j;
        max_value2 = i > k ? i : k;
        System.out.println(max_value2);
    }
}
*/

/*
public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        // шаг единица i++, можно еще i+=45 или переменная
        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }

        a = 3; b = 4; // Да, если мы разделяем инструкции точкой с запятой, их можно писать в одну строку
        if(a > b){
            a = a + b;
            a = a + 5;
        }
        System.out.printf("%d", a);// а = 3, поскольку условие не выполнено, вместе с инструкциями этого условия
        a = 3; b = 4;
        if(a > b)
            a = a + b;
            a = a + 7;
        System.out.printf("%d", a);// а = 10, поскольку условие не выполнено, но инструкция а = а + 7 выполнена независимио


        // Бесконечный ввод данных на потоке
        Scanner scan = new Scanner(System.in);
        int num;
        while (scan.hasNext()){
            int = in.nextInt();
        }

    }
}
*/

/*
public class Test {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        char b = in.next().charAt(0);
        System.out.print((int)a + (int)b);
    }
}
*/
/*
public class Test {
    public static void main(String[] args) throws IOException {
        float f = (float) 1 / 3;
        double d = 1. / 3;
        boolean flag = true;
        char i = "i"; // тип данных для 1 буквы
        System.out.println(d);
        System.out.println(f);
        System.out.printf("%.20f", f);

        int a = in.nextInt();
        int b = in.nextInt();
        float c = (float) a / b;
        System.out.printf("%.2f", c);
    }
}
*/

/*
public class Test {
    public static void main(String[] args) throws IOException {
        int i; // 4 байта = 32 бита (1 << 31) -1
        byte b; // 1 байт = 8 бит (1 << 7) - 1
        long l; // 8 байт = 65 бит (1 << 63) -1
    }
}
*/

/*
public class Test {
    public static void main(String[] args) throws IOException {
        // Вариант с простой конструкцией
        System.out.println("Please, enter your integer:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a);
        // Вариант с более профессиональной и быстрой конструкцией
        BufferedReader bufin = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt((bufin.readLine()));
        System.out.println(b);
    }
}
*/

/*
public class Test {
    public static void main(String[] args) throws IOException{
        int a = 3, b = 13;
        // %d это присваивание принту значение переменной
        System.out.println("n = " + n); // с переходом на следующую строку
        System.out.print("n = " + n);   // без перехода на следующую строку
        System.out.printf("n = %d", n); // форматированный вывод как в Си ля вывода значение переменных
    }
}
*/




