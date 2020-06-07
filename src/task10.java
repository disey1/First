import java.util.Scanner;
public class task10 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество столбцов матрицы:");
        int collom = sc.nextInt();
        System.out.println("Введите количество строк матрицы:");
        int rows = sc.nextInt();
        int t,i;
        int table[][] = new int [rows][collom];
        System.out.println("Введите элементы ("+rows*collom+" чисел) матрицы");
        int sample[] = new int[rows*collom];
        int j;
        for(j=0;j<rows*collom;j++){
            sample[j] = sc.nextInt();
        }
        int k;
        for(t = 0,k=0;t<rows;++t){
            for(i=0; i<collom;++i){
                if(t == 0){
                    table[t][i] = sample[k]*3;
                    System.out.print(table[t][i] + " ");
                }
                else{
                    table[t][i] = sample[k];
                }
                k++;

            }
        }
    }
}