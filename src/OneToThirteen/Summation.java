package OneToThirteen;

import java.util.Scanner;

/**
 * 求多项式的和
 *
 * @author hetongxue
 * @date 2022/9/1 - 22:22
 */
public class Summation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入整数n：");
        int n=s.nextInt();
        double sum=0;
        for(double i=1;i<=n;i++){
            if(i%2!=0){
                sum+=1/i;
            }else{
                sum-=1/i;
            }
        }
        System.out.print(String.format("%.2f",sum));
    }
}
