package MiltidimensionArray;
import java.util.Scanner;
public class pascal_Triangle {
    static  void pascalTriangle(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int [][] pascal(int n){
        int arr[][]=new int[n][];
        for(int i=0; i<n;i++){
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for (int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }return arr;
    }

    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n= sc.nextInt();
        int arr[][]=pascal(n);

          pascalTriangle(arr);
    }
}
