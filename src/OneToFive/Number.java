package OneToFive;


import java.util.Scanner;

/**
 * 报数问题
 *
 * @author hetongxue
 * @date 2022/8/29 - 20:18
 */
public class Number {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("输入数值n,m：");
        int n = s.nextInt();
        int m=s.nextInt();
        int count = 0;
        int people = n;

        int[] ans = new int[n];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = i + 1;
        }

        while (people > 0) {
            for (int i = 0; i < n; i++) {
                if (ans[i] != -1) {
                    count++;
                }

                if (count == m) {
                    count = 0;
                    ans[i] = -1;
                    people--;
                    System.out.print(i + 1 + " ");
                }
            }
        }






    }

}




