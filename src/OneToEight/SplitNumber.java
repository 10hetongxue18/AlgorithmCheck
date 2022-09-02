package OneToEight;

import java.util.Scanner;

/**
 * 拆分一个三位数的个位、十位、百位
 *
 * @author hetongxue
 * @date 2022/8/31 - 8:45
 */
public class SplitNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一个三位数：");
        int num=s.nextInt();
        int bit=num%10;
        int ten=num/10%10;
        int hundredth=num/100;

        System.out.println(bit+" "+ten+" "+hundredth);
    }


}
