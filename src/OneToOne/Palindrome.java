package OneToOne;

import java.util.Scanner;

/**
 * 回文
 *
 * @author hetongxue
 * @date 2022/8/29 - 12:01
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("判断回文，请输入一个字符串：");
        String str = s.nextLine();


        int countHuiWen = 0;
        for (int k = 0; k < str.length() / 2; k++) {
            if (str.substring(k, k + 1).equals(str.substring(str.length() - k - 1, str.length() - k) )) {
                countHuiWen++;
            }
        }
        if (countHuiWen == str.length() / 2) {
            System.out.println("是回文");
        } else {
            System.out.println("不是回文");
        }

    }

}



