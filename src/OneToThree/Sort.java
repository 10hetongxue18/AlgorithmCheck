package OneToThree;

import java.util.Scanner;

/**
 * 从小到大排序
 *
 * @author hetongxue
 * @date 2022/8/29 - 15:04
 */
public class Sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[3];
        System.out.print("请输入三个整数（用空格隔开）：");
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        if(x>0&&x<1000){

        }
        arr[0]=x;
        arr[1]=y;
        arr[2]=z;
        //冒泡排序算法
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("从小到大排序为:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
