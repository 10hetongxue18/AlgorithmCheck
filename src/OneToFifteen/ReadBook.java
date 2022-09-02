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
        System.out.println("输入书的页数n：");
        int n=s.nextInt();
        int sum=0;
        int day = 0;
        for(int i=1;i<=n;i++){
            if(i==1){
                sum+=1;
            }else{
                sum+=2;
                day=n/sum;
            }
        }
        
        System.out.println("小明看完整本书需要："+day);
    }
}
