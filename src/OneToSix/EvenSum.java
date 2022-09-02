package OneToSix;

import java.util.Scanner;

/**
 * 求偶数和
 *
 * @author hetongxue
 * @date 2022/8/30 - 11:31
 */
public class EvenSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入数值n(n>0)：");
        int n=sc.nextInt();


        int sum=0;


        int[] a=new int[n];

        if(n>0&&n<1000) {

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (a[i] % 2 == 0) {
                    sum += a[i];
                }

            }
            System.out.println(sum);
        }else{
            return;
        }

    }
}
