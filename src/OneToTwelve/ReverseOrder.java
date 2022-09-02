package OneToTwelve;

import java.util.Scanner;

/**
 * 逆序输出
 *
 * @author hetongxue
 * @date 2022/9/1 - 10:42
 */
public class ReverseOrder {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入十个整数：");
        int[] num=new int[10];
        for(int j=0;j<num.length;j++){
            num[j]=s.nextInt();
        }
        for(int i=9;i>=0;i--){
            System.out.print(num[i]+"\t");
        }
        //1 2 3 4 5 6 7 8 9 0
    }
}
