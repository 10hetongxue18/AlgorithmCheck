package OneToSeven;

import java.util.Scanner;

/**
 * 自定义函数之求字符串长度
 *
 * @author hetongxue
 * @date 2022/8/30 - 11:40
 */
public class StrLong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入字符串：");
        String str=sc.nextLine();


        if(str.length()<=255&&str.length()>0) {

            char[] c = str.toCharArray();

            System.out.println("长度为：" + c.length);
        }else {
            return;
        }
    }

}
