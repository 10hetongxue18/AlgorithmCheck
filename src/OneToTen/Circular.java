package OneToTen;

import java.util.Scanner;

/**
 * 圆的面积
 *
 * @author hetongxue
 * @date 2022/8/31 - 20:14
 */
public class Circular {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一个半径，浮点类型：");
        double r=s.nextDouble();
        double PI=3.14;
        double area;
        if(r>0&&r<5){
            area=2*PI*r;
            System.out.print("圆的面积："+area);
        }
    }

}
