package OneToFour;

import java.util.Scanner;

/**
 * 公式求和
 *
 * @author hetongxue
 * @date 2022/8/29 - 16:30
 */
public class FormulaSummation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入n：");
        int n=s.nextInt();
        int sum=0;
        int a=0;
        if(n<=5){
            for(int i=1;i<=n;i++){
               a=a*10+2;
               sum+=a;
            }
            System.out.println("Sn="+sum);
        }else{
            System.out.println("请输入正确的n取值");
        }

    }

}
