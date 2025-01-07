// Swapping the two interger number
package swaping;
public class Swapping_two_num_02 {
    static void swap1(int a,int b){
        System.out.println("Before swapping the value:");
        System.out.println("a:" +a);
        System.out.println("b:" +b);
//** Using the third variable for store the original value
       int temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping th value");
        System.out.println("a:" +a);
        System.out.println("b:"+b);

    }
    public static void main(String[] args) {
        int a=85;
        int b=95;
//* calling the function
             swap1(a,b);
    }
}
