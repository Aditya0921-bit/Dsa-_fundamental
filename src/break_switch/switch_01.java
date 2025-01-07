//Print the frist multiple of 5 which also a multiple of 7
package break_switch;

public class switch_01 {
    public static void main(String[] args) {
        int num =1;
        while (true){
            if (num %5==0 && num%7==0){
                System.out.println("The number is which is multiple of  by 5 and 7:");
                System.out.println(num);
                break;
            } num++;

        }
    }
}
