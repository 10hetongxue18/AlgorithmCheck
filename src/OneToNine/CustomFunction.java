package OneToNine;

import java.util.Scanner;

/**
 * 自定义函数之字符提取
 *
 * @author hetongxue
 * @date 2022/8/31 - 19:48
 */
public class CustomFunction {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一行字符串（字符串长度不超过15）：");
        String str=s.nextLine();
        String a="";
        if(str.length()<=15){
            char[] ch = str.toCharArray();
            System.out.print("输出其中的元音字母：");
            for(int i=0;i<ch.length;i++){
                if(ch[i]==97||ch[i]==101||ch[i]==105||ch[i]==111||ch[i]==117){
                    a=String.valueOf(ch[i]);
                    System.out.print(a);
                }
            }
        }

    }
}
