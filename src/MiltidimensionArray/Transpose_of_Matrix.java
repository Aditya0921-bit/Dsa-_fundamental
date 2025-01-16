//** Transpose of the matrix
package MiltidimensionArray;

import java.util.Arrays;

public class Transpose_of_Matrix {
public static void main (String[]args){
    int matr[][]={{1,2,3,},{4,5,6},{7,8,9}};
     int r=matr.length;
     int c=matr[0].length;
    System.out.println("Before Transpose the matrix:"+matr);
    int sum[][] =new int[r][c];
    sum[0][0]=matr[c][r];
    sum[0][1]=matr[c][r];
    sum[0][2]=matr[c][r];
    sum[1][0]=matr[r][c];
    sum[1][1]=matr[c][r];
    sum[1][2]=matr[c][r];
    sum[2][0]=matr[c][r];
    sum[2][1]=matr[c][r];
    sum[2][2]=matr[c][r];
    System.out.println("After transpose the matrix:"+sum);
    System.out.println();


//    for (int i=0;i<r;i++){
//        for(int j=0;j<c;c++){
//         int sum[i][j]=matr[j][i];
//         }
//    }
}
}
