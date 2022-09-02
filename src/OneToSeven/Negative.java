package OneToSeven;

import java.util.Scanner;

/**
 * 负数个数统计
 *
 * @author hetongxue
 * @date 2022/8/30 - 11:36
 */
public class Negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入10位整型数:");
        int[] a=new int[10];

        int num=0;




        for(int i=0;i<10;i++){
            if(a[i]>-100000&&a[i]<100000) {
                a[i] = sc.nextInt();

                if (a[i] < 0) {
                    num++;
                }
            }else{
                return;
            }
        }

        System.out.println("负数的个数为："+num);
    }

}
