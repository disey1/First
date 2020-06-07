import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sample[] = new int[number];
        int i;
        System.out.println("Введите элементы массива:");
        for(i=0;i<number;i++){
            //System.out.println("Введите " + i +"-й элемент массива");
            sample[i] = sc.nextInt()*2;
        }
        for(i=0;i<number;i++)
            System.out.println("Элемент ["+i+"] : " + sample[i]);
    }
}
