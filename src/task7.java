import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        int X = 10;
        int Y = 17;
        int Z = 0;
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == X || number == Y || number == Z){
            System.out.println("Данное значение имеется в константах");
        }
        else{
            System.out.println("Такой константы нет!");
        }
        }
}
