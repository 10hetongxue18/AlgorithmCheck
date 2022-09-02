package OneToFour;

import java.util.Scanner;

/**
 * 数位交换
 *
 * @author hetongxue
 * @date 2022/8/29 - 16:11
 */
public class DigitalSwitching {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个三位整数：");
        int num=s.nextInt();
        int bit,ten,hundredth;

        hundredth=num%10;
        ten=num/10%10;
        bit=num/100%10;

        System.out.print("交换个位和百位后：");
        System.out.print(hundredth);
        System.out.print(ten);
        System.out.print(bit);
    }
}
