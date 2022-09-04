package OneToFifteen;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * 计算看完一本书的天数
 *
 * @author hetongxue
 * @date 2022/9/2 - 0:39
 */
public class ReadBook {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入书的页数n：");
        int n=s.nextInt();
        int day=0;
        for (int i = 1; i <=n ; i++) {
            if((1+(2*i-1))*i/2==n){
                day=i;
            }
        }
        System.out.println("小明看完整本书需要："+day+"天");
    }
}
