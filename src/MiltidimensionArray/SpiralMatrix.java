//** Spiral matrix

package MiltidimensionArray;
import java.util.Scanner;
public class SpiralMatrix {
static void  printMatrix(int matrix[][]) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
    }
}
    static void sprialOrder(int matrix[][],int r,int c){
    int top=0;
    int bottomRow=r-1;
    int leftCol=0;
    int rightCol=c-1;
    int total=0;
//    int target=r*c;

    while(total< r*c) {
        for (int j=leftCol;j<=rightCol&& total< r*c;j++ ) {
            System.out.print(matrix[top][j]+" ");
            total++;
        }
        top++;
        for (int i=top;i<=bottomRow && total< r*c;i++){
            System.out.print(matrix[i][rightCol]+ " ");
            total++;
        }

        rightCol--;

        for(int j=rightCol;j>=leftCol && total< r*c;j--) {
            System.out.print(matrix[bottomRow][j]+" ");
            total++;
        }
        bottomRow--;
        for (int  i=bottomRow;i>=top && total< r*c;i--){
            System.out.print(matrix[i][leftCol]+" ");
            total++;
        }
        leftCol++;
    }
    }
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Row and colum number:");
int r= sc.nextInt();
int c= sc.nextInt();
int matrix[][]=new int[r][c];
int total=r*c;
    System.out.print("Enter "+ total +"  values");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
//    printMatrix(matrix);

    System.out.println("The sprial  given matrix is:");
    printMatrix(matrix);
    System.out.println();
    System.out.println("The sprial matrix is:");
    System.out.println();
   sprialOrder(matrix,r,c);

}

}
