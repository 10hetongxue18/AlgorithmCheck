package OneToOne;

import java.util.Scanner;

/**
 * 最大值与最小值
 *
 * @author hetongxue
 * @date 2022/8/29 - 10:43
 */
public class MaxAndMin {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int Max = 0;
        int Min = 0;
        System.out.println("请输入数据个数：");
        int n=s.nextInt();

        int[] num = new int[n];
        if(n<=10){
            for (int i=1;i<=n;i++){
                System.out.println("请输入第"+i+"个整数：");
                num[i-1]=s.nextInt();
            }

            int max=1;
            int min=1;
            Max=Min=num[0];
            for(int j=0;j<num.length;j++){
//                System.out.println("数组中第"+j+"个数据的是："+num[j]);

                if(num[j]>Max){
                    Max=num[j];
                    max=j+1;
                }

                if(num[j]<Min){
                    Min=num[j];
                    min=j+1;
                }

            }

            System.out.println("输入数据个数："+n);
            System.out.println("最大值："+Max+"，第"+max+"个位置");
            System.out.println("最小值："+Min+"，第"+min+"个位置");
        }else{
            System.out.println("你输入的数据个数必须在1-10内！");
        }


    }

}
