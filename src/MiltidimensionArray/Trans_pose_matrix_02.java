//** Transpose of the matrix:
package MiltidimensionArray;
import javax.imageio.ImageTranscoder;
import java.util.Scanner;
public class Trans_pose_matrix_02 {
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
//    public static int[][] findTranspose(int arr[][], int r, int c) {
//        int ans[][] = new int[c][r];
//        for (int i = 0; i < c; i++) {
//            for (int j = 0; j < r; j++) {
//                ans[i][j] = arr[j][i];
//            }
//            System.out.println(ans);
//        }return ans;

//** InpalaceMatrix
    static void inplaceMatrix(int matrix[][],int r,int c) {
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[i][j]=temp;
            }
        }
    }

    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and colum:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        int totalElement = r * c;
        System.out.println("Total value");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("input matrix");
        inplaceMatrix(matrix,r,c);
        printMatrix(matrix);
//        int ans[][]=findTranspose(matrix,r,c);
//        printMatrix(ans);

        }
    }
//}
