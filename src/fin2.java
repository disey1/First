import java.util.Scanner;

/*Написать программу сортировки по возрастанию заданного пользователем массива чисел. Пользователь программы должен задавать размер массива и наполнять его числами.
        Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.*/
public class fin2 {
    public static void main (String[] args){
        System.out.println("Введите размерность массива:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int arr[] = new int[number];
        int k;
        System.out.println("Введите элементы массива:");
        for(k=0;k<number;k++){
            //System.out.println("Введите " + i +"-й элемент массива");
            arr[k] = sc.nextInt();
        }
        int temp,j;
        for(int i = 0; i <arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
            temp = arr[i+1];
            arr[i+1] = arr[i];
            j=i;
            while(j>0 && temp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
            }
        }
        System.out.println("Вывод отсортированного массива");
        for(k=0;k<number;k++)
            System.out.print(arr[k]+" ");
    }
}