//** Multi dimension array

package MiltidimensionArray;
import java.util.Scanner;
public class usearInput {
    static void twoDArray(int arr[][]){

    }
public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number of rows");
     int r=sc.nextInt();
    System.out.println("Enter the number of colums:");
     int c= sc.nextInt();
    System.out.print("Enter:" +r*c+ "element");
     int arr[][]=new int [r][c];
//* Using two loop for both i,j
     for(int i=0;i<r;i++){
         for(int j=0;j<c;j++) {
             arr[i][j] = sc.nextInt();
         }

     }
     twoDArray(arr);
}
}
