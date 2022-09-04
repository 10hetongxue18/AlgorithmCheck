package OneToNineteen;

import java.util.Scanner;

/**
 * 筛选数据
 *
 * @author hetongxue
 * @date 2022/9/4 - 11:53
 */
public class FilterData {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];
        if(n>0&&n<=20){
            for (int i = 0; i <n ; i++) {
              nums[i]=s.nextInt();
              if(nums[i]%3==0){
                  System.out.print(nums[i]+" ");
              }
            }
        }
        //2 3 5 7 9 10
    }
}
