package OneToNine;

import java.util.Scanner;

/**
 * 删除空格
 *
 * @author hetongxue
 * @date 2022/8/31 - 19:19
 */
public class RemoveSpaces {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一行字符串（不超过255个字符）：");
        String str=s.nextLine();
        if(str.length()<=255){
            str=str.replaceAll(" ","");
            System.out.println("删除空格之后的字符串："+str);
        }
    }

}
