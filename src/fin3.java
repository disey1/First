/*Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
        Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
        (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)*/

import java.util.Scanner;

public class fin3 {
    public static void main(String[] args) {
        System.out.println("Введите количество рублей, которое планируете обменять: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = 67.55;
        double n1 = n/d;
        System.out.printf("За "+n+ " рублей вы получите %.2f$", n1);
    }

}