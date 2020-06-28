import java.util.Scanner;
public class task15 {
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
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
        System.out.println("Вывод отсортированного массива");
        for(k=0;k<number;k++)
            System.out.print(arr[k]+" ");
    }
}