package OneToSixteen;

import java.util.Scanner;

/**
 * 计算平均身高
 *
 * @author hetongxue
 * @date 2022/9/2 - 9:33
 */
public class AverageHeight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入学生人数：");
        int n=s.nextInt();
        int[] stu=new int[n];
        int sum=0;
        System.out.print("输入"+n+"个学生的身高：");
        for (int i = 0; i <stu.length ; i++) {
            stu[i]=s.nextInt();
            sum+=stu[i];
        }
        int Average=sum/n;
        System.out.print("平均身高："+Average);
        //170 172 165 154 162 180 156 172 190 160
    }
}
