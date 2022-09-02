package OneToTwo;

import java.util.Scanner;

/**
 * 判断素数
 *
 * @author hetongxue
 * @date 2022/8/29 - 13:00
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个非负数：");
        int num=s.nextInt();

        int prime = 2;
        while(prime<num){
            if(num % prime == 0){
                System.out.println(num+ "不是素数");
                break;
            }else{
                prime++;
            }
        }


     if(prime>=num){
         System.out.println(num+ "是素数");
     }

    }
}
