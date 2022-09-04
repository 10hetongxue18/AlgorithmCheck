package OneToEighteen;

import java.util.Scanner;

/**
 * 盈亏状况
 *
 * @author hetongxue
 * @date 2022/9/4 - 10:52
 */
public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入数据量：");
        int n=s.nextInt();
        System.out.print("输入2*n个数据：");
        int[] nums=new int[2*n];
        int result=0;
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=s.nextInt();
            if(i<nums.length/2){
                result+=nums[i];
            }else{
                result-=nums[i];
            }
        }
        System.out.println("企业盈利："+result);
        //123 140 150 160 70 80 75 76
    }
}
