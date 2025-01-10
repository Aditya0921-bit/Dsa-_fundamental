//** Addition of two number:
package MiltidimensionArray;

public class AdditionOfTwonum {
    public static void main(String[] args) {
        int arr[][] = {{1, 2},
                       {4, 5}};
        int arr2[][] = {{1, 2,},
                        {3, 4},
        };
        int row = arr.length;
        int colum = arr.length;
        int sum[][] = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
            sum[i][j]=arr[i][j]+arr2[i][j];
                System.out.print(sum[i][j] + " ");


            }
        } System.out.println();


        }
    }
