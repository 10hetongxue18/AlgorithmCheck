package OneToEleven;

import java.util.Scanner;

/**
 * 分段函数求值
 *
 * @author hetongxue
 * @date 2022/9/1 - 9:21
 */
public class PiecewiseFun {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一个数x（取值范围：0<x<1000）：");
        int x=s.nextInt();
        if(x>0&&x<1000){
            if(x<1){
                System.out.println("y="+x);
            }else if(x>=1&&x<10){
                System.out.println("y="+(2*x-1));
            }else{
                System.out.println("y="+(3*x-11));
            }
        }

    }
}
