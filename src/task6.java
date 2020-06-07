import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        System.out.println("Введите X");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Введите Y");
        Scanner sc1 = new Scanner(System.in);
        int y = sc1.nextInt();
        System.out.println("Введите Z");
        Scanner sc2 = new Scanner(System.in);
        int z = sc2.nextInt();
        int s = ((x+y+z)/3)/2;
        if (s >3){
            System.out.println("Программа выполнена корректно");
            }
        }
}