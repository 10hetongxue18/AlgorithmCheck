package OneToTwo;

import java.util.Scanner;

/**
 * 阶乘求和
 *
 * @author hetongxue
 * @date 2022/8/29 - 15:03
 */
public class Factorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("输入n的值(n<=10)：");
        int n=s.nextInt();
        int sum=1;
        int Sn=0;
        if(n<10){
            for(int j=1;j<=n;j++){
                sum=j*sum;
                Sn+=sum;
            }
            System.out.println("输入n的值(n<=10)："+n);
            System.out.println("Sn="+Sn);
        }else{
            return;
        }

    }

}
