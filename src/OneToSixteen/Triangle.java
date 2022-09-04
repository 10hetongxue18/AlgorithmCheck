package OneToSixteen;

import java.util.Scanner;

/**
 * 三角形判断
 *
 * @author hetongxue
 * @date 2022/9/2 - 9:46
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        double area,perimeter;


        if((a+b>c)||(a+c>b)||(c+b)>a){
            int ss=(a+b+c)/2;
            int temp=ss*(ss-a)*(ss-b)*(ss-c);
            area=Math.sqrt(temp);
            perimeter=a+b+c;
            System.out.println("边长为"+a+","+b+","+c+"的三角形周长为"+String.format("%.2f",perimeter)+",面积为"+String.format("%.2f",area));
        }else{
            System.out.println("三条边无法构成三角形");
        }


    }
}
