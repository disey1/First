import java.util.Scanner;
public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String str1 = sc.nextLine();
        System.out.println("Введите вторую строку");
        String str2 = sc.nextLine();
        if (str1.length() > str2.length()){
            System.out.println(str1);
        }
        else if (str1.length()< str2.length()){
            System.out.println(str2);
        }
        else{
            System.out.println("Строки равны");
        }
    }
}
