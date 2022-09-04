package OneToTwenty;

import java.util.Scanner;

/**
 * 计算握手
 *
 * @author hetongxue
 * @date 2022/9/4 - 13:13
 */
public class Handshake {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入学生人数：");
        int n=s.nextInt();
        if(n>0&&n<=50){
            int sum=0;
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <=n-i ; j++) {
                    ++sum;
                }
            }
            System.out.println(sum);
        }

    }
}
