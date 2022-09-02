package OneToEight;

import java.util.Scanner;

/**
 * 商场购物
 *
 * @author hetongxue
 * @date 2022/8/31 - 10:05
 */
public class ShoppingMall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入你购物的消费金额：");
        int x=s.nextInt();
        double y;
        int option=((x<1600)?0:(x>=1600&&x<2400)?5:(x>=2400&&x<3200)?10:(x>=3200&&x<6400)?15:20);
        double money=x;
        switch (option){
            case 0:
                y=0;
                break;
            case 5:
                y=0.05;
                x*=y;
                money-=x;
                break;
            case 10:
                y=0.10;
                x*=y;
                money-=x;
                break;
            case 15:
                y=0.15;
                x*=y;
                money-=x;
                break;
            case 20:
                y=0.20;
                x*=y;
                money-=x;
                break;
        }

        System.out.print("你实际应付的购物金额为："+String.format("%.2f",money));

    }
}
