import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        String str = sc.nextLine();
        int result = 0;
        int m = 0;
        char d;
        for (int i = 0; i < str.length(); i++) {
            d = str.charAt(str.length() - 1 - i);
            if(d == '1' || d == '0') {
                if (d == '1'){
                    int s = 1;
                    //Получение степени двойки
                for(int j=0;j<i;j++){
                    s = s*2;
                }
                m += s;
                }
            } else {
                System.out.println("Не является двоичным числом");
                break;
            }
            result = (m);
        }
        if (result != 0 ){
            System.out.println(result);
        }
    }
}