package OneToSeventeen;

import java.util.Scanner;

/**
 * 字母转换
 *
 * @author hetongxue
 * @date 2022/9/2 - 11:14
 */
public class LetterConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一个字符串：");
        String str=s.nextLine();
        char[] ss=str.toCharArray();
        for(int i=0;i<ss.length;i++){
            if(Character.isUpperCase(ss[i])){
                ss[i]=Character.toLowerCase(ss[i]);
            }else if(Character.isLowerCase(ss[i])){
                ss[i]=Character.toUpperCase(ss[i]);
            }
        }

        String s1 = String.valueOf(ss);
        System.out.println(s1);

    }

}
