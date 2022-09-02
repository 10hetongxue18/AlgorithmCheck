package OneToFifteen;

import java.util.Scanner;

/**
 * 求成绩单中最高和第二高的成绩
 *
 * @author hetongxue
 * @date 2022/9/2 - 0:53
 */
public class SchoolReport {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入数据个数：");
        int n=s.nextInt();
        System.out.print("输入"+n+"个整数：");
        int[] nums=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        //60 85 92 74 50
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=0;j<nums.length-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println("最高成绩："+nums[4]);
//        for(int i=0;i<nums.length;i++){
//            System.out.print(nums[i]+" ");
//
//        }
        System.out.print("第二高成绩："+nums[3]);


    }
}
