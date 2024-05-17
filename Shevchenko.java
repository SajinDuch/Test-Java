import java.util.Objects;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        System.out.println("Задание 2.1 Операции с двумя целыми числами");
        Scanner scan1 = new Scanner(System.in);
            System.out.print("Пожалуйста, введите значения переменных a, b\n");

            System.out.print("Введите переменную: a = ");
                int a = scan1.nextInt();
            System.out.print("Введите переменную: b = ");
                int b = scan1.nextInt();

                if (a > b) {
                System.out.println("a > b");
                    } else if (a < b) {
                System.out.println("a < b");
                    } else {
                System.out.println("a = b");
            }

            System.out.println("Сумма чисел: " + (a + b));
            System.out.println("Разность чисел: " + (a - b));
            System.out.println("Произведение чисел: " + (a * b));


                float k = (float) a / b;
            System.out.println("Деление чисел: " + k);
            //-----
        System.out.println("Задание 2.2 Сравнение двух строк");

        Scanner scan2 = new Scanner(System.in); // Получение данных от пользователя
        System.out.println("Введите ваше первое слово: ");
            String username1 = scan2.nextLine();
        System.out.println("Введите ваше второе слово: ");
            String username2 = scan2.nextLine();

            if (username1.equals(username2)){
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }
          //--------
        System.out.println("Задание 2.3 Вывод четных чисел из массива от 1 до 10");

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.print(array[i]+", ");
            }
        }

    }
}
