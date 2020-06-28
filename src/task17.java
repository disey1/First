import java.io.*;
import java.util.Scanner;
public class task17 {
    public static void main(String[] args){
        System.out.println("Введите имя файла :");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для остановки записи введите слово - 'стоп' ");
        try (FileWriter fw = new FileWriter(str1+".txt")) {
            do {
                System.out.print("Введите текст для сохранения в файл: ");
                str = br.readLine();
                if (str.compareTo("стоп") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("стоп") != 0);
        }catch(IOException exc){
            System.out.println("Ошибка ввода-вывода: "+ exc);
        }
    }
}
