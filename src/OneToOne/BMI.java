package OneToOne;

import java.util.Scanner;

/**
 * 求BMI指数
 *
 * @author hetongxue
 * @date 2022/8/29 - 10:08
 */
public class BMI {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        float height;
//        float weight;
        double height;
        double weight;

        System.out.println("请输入身高：");
        height=s.nextDouble();
//        height=s.nextFloat();

        System.out.println("请输入体重：");
        weight=s.nextDouble();
//        weight=s.nextFloat();

        double BMI=weight/(height*height);

        System.out.println("体重："+weight);
        System.out.println("身高："+height);
        System.out.println("BMI指数："+BMI);//float:22.230987548828125 double:22.230987127541326
        System.out.println("BMI指数保留两位小数："+String.format("%.2f",BMI).toString());

        if(BMI<18.5){
            System.out.println("胖瘦情况:过轻");
        }else if(BMI>=18.5&&BMI<=24.9){
            System.out.println("胖瘦情况:正常");
        }else if(BMI>=25&&BMI<=29.9){
            System.out.println("胖瘦情况:过重");
        }else{
            System.out.println("胖瘦情况:肥胖");
        }

    }
}
