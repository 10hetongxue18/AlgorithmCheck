package OneToNineteen;

import java.util.Scanner;

/**
 * 数的特性
 *
 * @author hetongxue
 * @date 2022/9/4 - 12:38
 */
public class Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入数据：");
        int n=s.nextInt();
        if(n%2==0&&(n>4&&n<=12)){
            System.out.print(1+" ");
        }else{
            System.out.print(0+" ");
        }

        if(n%2==0||(n>4&&n<=12)){
            System.out.print(1+" ");
        }else{
            System.out.print(0+" ");
        }

        if((n%2!=0&&(n<4&&n>12))){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
