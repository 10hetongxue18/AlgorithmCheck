package OneToEighteen;

import java.util.Scanner;

/**
 * 求偶数斐波那契数
 *
 * @author hetongxue
 * @date 2022/9/4 - 10:58
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入数据个数n：");
        int n=s.nextInt();

        int[] nums={1,2,3,5,8,13,21,34,55,89};
        int sum=0;
        for (int i = 0; i <n ; i++) {
            if(nums[i]%2==0){
                sum+=nums[i];
            }
        }
        System.out.println("前n项其中偶数斐波那契数的和是："+sum);

    }
}
