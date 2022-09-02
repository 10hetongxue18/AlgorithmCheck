package OneToThirteen;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * 删除有序数组中的重复项
 *
 * @author hetongxue
 * @date 2022/9/1 - 22:55
 */
public class DeleteNums {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入10个有序的数组元素（元素取值范围：0~1000）：");
        int[] nums=new int[10];
        int t=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=s.nextInt();
            if(i==0 || nums[i]!=nums[i-1]){
                t++;
                nums[t]=nums[i];
                System.out.print(nums[i]+"\t");
            }
        }
        System.out.println();
        System.out.print(t);

        //1 1 2 3 4 4 4 5 6 7
    }
}
