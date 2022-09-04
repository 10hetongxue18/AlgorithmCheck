package OneToFourteen;

import java.util.Scanner;

/**
 * 计算被3或5整除数之和
 *
 * @author hetongxue
 * @date 2022/9/2 - 0:34
 */
public class CountSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一个数n：");
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0||i%5==0){
                sum+=i;
            }
        }
        System.out.println("1到"+n+"之间能够被3或者5整除的数之和是"+sum);

    }
}
