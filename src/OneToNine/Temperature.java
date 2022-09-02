package OneToNine;

import java.util.Scanner;

/**
 * 温度转换
 *
 * @author hetongxue
 * @date 2022/8/31 - 10:37
 */
public class Temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一个华氏温度，浮点数（取值范围：10~35）：");
        double temperature=s.nextInt();
        double C;
        if(temperature>10&&temperature<35){
            C=5*(temperature-32)/9;
            System.out.println("摄氏温度：C="+String.format("%.2f",C));
        }
    }
}
