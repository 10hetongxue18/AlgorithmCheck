package OneToSix;

import java.util.Scanner;

/**
 * 求三位数的各位数字之和
 * @author hetongxue
 * @date 2022/8/30 - 11:29
 */
public class Sum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个三位整数：");
        int c=sc.nextInt();

        if(c>=100&&c<1000) {
            int one = c % 10;
            int ten = (c / 10) % 10;
            int handred = c / 100;

            int sum = one + ten + handred;

            System.out.println("各位数字之和：" + sum);
        }else {
            return;
        }
    }
}
