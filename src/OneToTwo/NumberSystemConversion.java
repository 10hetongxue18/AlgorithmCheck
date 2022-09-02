package OneToTwo;

import java.util.Scanner;
import java.util.Stack;

/**
 * 数制转换
 *
 * @author hetongxue
 * @date 2022/8/29 - 13:18
 */
public class NumberSystemConversion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个十进制正整数：");
        int n=s.nextInt();
        int x;
        Stack<Integer> stack = new Stack<>();
        while(n>0){
            x=n%8;
            stack.push(x);
            n/=8;
        }
        System.out.print("转换成进制为：");
        while(!stack.empty()){
            int num = stack.pop();
            System.out.format("%d",num);
        }

    }

}
