package OneToFive;

import java.util.Scanner;

/**
 * 字符串反转
 *
 * @author hetongxue
 * @date 2022/8/29 - 17:19
 */
public class StringInversion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入字符串：");
        String str=s.nextLine();
        char[] chars = str.toCharArray();
        if(chars.length<25){
            System.out.println("反转后字符串：");
            for(int i=chars.length-1;i>=0;i--){
                System.out.print(chars[i]);
            }
        }else{
            return;
        }


    }

}
