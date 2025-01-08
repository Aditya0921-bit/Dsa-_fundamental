//** given an array of interger 'a' move all the evenn integer at bening fallowed by all th odd integer
//** The relative order of odd or even integers does not matters return an array that satisfies the condition

package array;

import java.util.Arrays;

public class Pratice {
    static int [] shortArrayByParity(int arr[]){
        int n=arr.length;
        int front=0;
        int end =n-1;
        while (front<end){
            if (arr[front] % 2==1 && arr[end] % 2==0){
//** Swap
                int temp = arr[front];
                arr[front] = arr[end];
                arr[end] = temp;
                front++;
                end--;


            }
//** Condition
            if (arr[front] % 2 == 0) {
                front++;
            }
            if (arr[end]%2==1) {
                end--;

            }
        }
         return arr;
    }

public static void main(String []args){
    int arr[]={3,4,6,10,7,8,13,4};
    int result[]= shortArrayByParity(arr);
    System.out.println("Shorted Array is:"+ Arrays.toString(result));

}
}
