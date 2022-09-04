package OneToSeventeen;

import java.util.Scanner;

/**
 * 求数的值
 *
 * @author hetongxue
 * @date 2022/9/2 - 11:07
 */
public class NumValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入整数n：");
        int n=s.nextInt();
        int num=0;
        for (int i = 1; i <=n ; i++) {
            if((i*5)-14==(i*2)+4){
                num=i;
            }
        }
        System.out.println("符合要求的数有："+num);

    }
}
