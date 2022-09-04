package OneToTwenty;

import java.util.Scanner;

/**
 * 求杨辉三角第n行的值
 *
 * @author hetongxue
 * @date 2022/9/4 - 14:09
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("输入n：");
        int n=sc.nextInt();
        int[][] t=new int[10][10];
        for(int i=0;i<t.length;i++){
            t[i][0]=t[i][i]=1;
            System.out.print(t[i][0]+" ");
            for(int j=1;j<i;j++){
                t[i][j]=t[i-1][j-1]+t[i-1][j];
                System.out.print(t[i][j]+" ");
            }
            if(i>0) {
                System.out.print(t[i][i] + " ");
            }
            System.out.println();
        }
        System.out.println("第"+n+"行的数据：");

        for (int i = 0; i <n ; i++) {
            System.out.print(t[n-1][i]+" ");
        }

    }
}
