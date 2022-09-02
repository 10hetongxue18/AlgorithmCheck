package OneToThree;

import java.util.Scanner;

/**
 * 求一个三位数的各位平方和
 *
 * @author hetongxue
 * @date 2022/8/29 - 15:33
 */
public class SumSquares {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个三位整数：");
        int ss=s.nextInt();
        int bit;
        int ten;
        int hundredth;

        bit=ss%10;
        ten=ss/10%10;
        hundredth=ss/100%10;
        int squares=(bit*bit)+(ten*ten)+(hundredth*hundredth);

        System.out.println("各位数字平方和为："+squares);

    }

}
