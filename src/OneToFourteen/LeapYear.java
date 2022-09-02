package OneToFourteen;

import java.util.Scanner;

/**
 * 求出生年份是否闰年
 *
 * @author hetongxue
 * @date 2022/9/2 - 0:26
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入5个出生年份：");
        int[] year=new int[5];
        for(int i=0;i<year.length;i++){
            year[i]=s.nextInt();
            if((year[i]%4==0&&year[i]%100!=0)||(year[i]%400==0)){
                System.out.print("是"+"\t");
            }else{
                System.out.print("否"+"\t");
            }
        }
        //1990 1993 1996 1998 2000
    }
}
