package OneToSix;

import java.util.Scanner;

/**
 * 自定义话术之字符串连接
 *
 * @author hetongxue
 * @date 2022/8/30 - 11:33
 */
public class FunStr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("输入字符串1:");
        String str1=sc.next();
        System.out.print("输入字符串2:");
        String str2=sc.next();

        String str3=str1+str2;

        System.out.println(str3);
    }

}
