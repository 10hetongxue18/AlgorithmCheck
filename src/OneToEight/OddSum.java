package OneToEight;

import java.util.Scanner;

/**
 * 求奇数和
 *
 * @author hetongxue
 * @date 2022/8/31 - 8:56
 */
public class OddSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入数据个数：");
        int n = s.nextInt();
        int[] OldNum=new int[n];
        int sum=0;

        System.out.print("输入整数：");
        for (int i=0;i<n;i++){
            int[] NewNum=new int[i+1];
            OldNum[i]=s.nextInt();

            if(OldNum[i]%2!=0){
                NewNum[i]=OldNum[i];
//                System.out.println(NewNum[i]);
                sum+=NewNum[i];
            }
        }
        System.out.println(sum);
    }
}
