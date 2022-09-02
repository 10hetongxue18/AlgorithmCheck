package OneToTwelve;

import java.util.Scanner;

/**
 * 移除元素
 *
 * @author hetongxue
 * @date 2022/9/1 - 11:00
 */
public class RemoveElement {

    public static int deleteVal(int[] num,int val){
        int j=-1;
        for(int i=0;i<num.length;i++){
            if(num[i]!=val){
                j++;
                num[j]=num[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num=new int[10];
        System.out.print("输入10个数组元素值（数组元素值范围0~1000）：");
        for(int i=0;i<num.length;i++){
            num[i]=s.nextInt();
        }
            System.out.print("输入数值val（0<val<1000）:");
            int val=s.nextInt();
            if(val>0&&val<1000){
               int len = deleteVal(num,val);
//               for(int j=0;j<len;j++){
//                   System.out.print(num[j]+"\t");
//               }
                System.out.println(len);
            }
                //1 3 2 4 3 5 6 7 8 9
    }
}
