package OneToNineteen;

import java.util.Scanner;

/**
 * 数值求和
 * @author hetongxue
 * @date 2022/9/4 - 13:00
 */
public class NumSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一个字符串：");
        String str=s.nextLine();
        if(str.length()<255){
            int sum=0;
            char[] chars = str.toCharArray();
            for (int i = 0; i <chars.length ; i++) {
                if(chars[i]>='0'&&chars[i]<='9'){
                    int ss = Integer.parseInt(String.valueOf(chars[i]));
                    sum+=ss;
//                    System.out.println(chars[i]);
                }
            }
            System.out.print(sum);
        }
        //1a2b3c4d5e
    }
}
