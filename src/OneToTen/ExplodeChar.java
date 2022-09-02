package OneToTen;

import java.util.Scanner;

/**
 * 分解字符
 *
 * @author hetongxue
 * @date 2022/8/31 - 20:25
 */
public class ExplodeChar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一行字符串（不超过255个字符）：");
        String str=s.nextLine();
        if(str.length()<=255){
            String[] strl=str.split(",");
            for(int i=0;i<strl.length;i++){
                System.out.println(strl[i]);
            }
        }

    }
}
