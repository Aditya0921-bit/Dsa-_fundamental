package break_switch;

public class Switch_02 {
    public static void main(String[] args) {
//        int num=1;
        for(int num=1;num <=50; num++) {
            if (num % 3 == 0) {
                continue;
            }
            System.out.println("The number is:");
            System.out.println(num);

        }
    }
}
