package OneToSeven;

import java.util.Scanner;

/**
 * 统计学生成绩
 *
 * @author hetongxue
 * @date 2022/8/30 - 11:38
 */
public class Statistics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("一共有多少学生：");



        int n=sc.nextInt();

        if(n>0&&n<50) {


            int[] a = new int[n];

            int y = 0, j = 0, bj = 0;

            System.out.println("输入n个学生成绩:");


            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (a[i] >= 0 && a[i] <= 100) {

                    if (a[i] >= 85 && a[i] <= 100) {
                        y++;
                    } else if (a[i] >= 60 && a[i] <= 84) {
                        j++;
                    } else if (a[i] >= 0 && a[i] < 60) {
                        bj++;
                    }
                }else {
                    System.out.println("成绩不符合要求");
                }

            }

            System.out.println("优秀(大于85):" + y);
            System.out.println("及格(60-84):" + j);
            System.out.println("不及格(小于60):" + bj);

        }else {
            System.out.println("学生人数不对");
        }
    }
}
