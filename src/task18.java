/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt, а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
        Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.*/
import java.io.*;
public class task18 {
    public static void main(String[] args){
        String s;
        int i = 0;
        int k = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("src/text2.txt")))
        {
            while((s = br.readLine()) != null) {
                System.out.println(s);
                i++; //Сохраняем в i число строк в файле
            }
        }   catch(IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (FileWriter fw = new FileWriter("src/text2.txt")) {
            do {
                if (i == 0) {System.out.print("Файл пуст"); break;}
                System.out.print("Запись в строку "+(k+1)+" :");
                str = br.readLine();
                str = str + "\r\n";
                fw.write(str);
                k = ++k;
            } while (k < i);
        }catch(IOException exc){
            System.out.println("Ошибка ввода-вывода: "+ exc);
        }
        System.out.print("Файл успешно обновлен");
    }
}