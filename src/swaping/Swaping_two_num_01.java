//Give 2 integer a and b Swap the given value using temporary variable
package swaping;
 public class Swaping_two_num_01 {
         static void swap(int a,int b) {
             System.out.println("The original Element before Swap:");
             System.out.println("a:" + a);
             System.out.println("b:" + b);
//* Temp are store  the original array
//*  logic
             int temp = a;
             a = b;
             b = temp;

             System.out.println("After Swaping:");
             System.out.println("a:" + a);
             System.out.println("b:" + b);
         }
         public static void main(String[]args) {
             int a = 7;
             int b=8;
// * calling the function
             swap(a,b);

         }
     }
