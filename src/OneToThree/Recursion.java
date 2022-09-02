package OneToThree;


import java.util.Scanner;

/**
 * 递归求数
 *
 * @author hetongxue
 * @date 2022/8/29 - 15:49
 */
public class Recursion {

    static void fact(String str) {
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入5个字符：");
        String ans = scanner.next();
        fact(ans);


    }
}
