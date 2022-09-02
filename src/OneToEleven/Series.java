package OneToEleven;

import java.util.Scanner;

/**
 * 斐波那契数列
 *
 * @author hetongxue
 * @date 2022/9/1 - 10:38
 */
public class Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个整数：");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.print("“斐波纳契数列”:");
        for (int i = 1, j = 1; i <= arr.length; i = i + j, j = i + j) {
            System.out.print(" " + i + " " + j);
        }

    }
}
