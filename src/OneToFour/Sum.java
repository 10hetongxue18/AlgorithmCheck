package OneToFour;

import java.util.Scanner;

/**
 * 求和
 *
 * @author hetongxue
 * @date 2022/8/29 - 16:03
 */
public class Sum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入n和m：");
        int n=s.nextInt();
        int m=s.nextInt();
        int sum=0;
        if(n>0&&n<m&&m<20){
            for(int i=n;i<=m;i++){
                sum+=i;
//                System.out.println(i);
            }
            System.out.println("n到m的和为："+sum);
        }else{
            System.out.println("你输入的数字不在范围内");
        }


    }

}
