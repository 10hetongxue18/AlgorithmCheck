package OneToEleven;

import java.util.*;

/**
 * 数组整合
 *
 * @author hetongxue
 * @date 2022/9/1 - 9:26
 */
public class ArraySum {

    public static void print(int[] array1,int[] array2){
        Scanner s = new Scanner(System.in);
        for(int n=1;n<=2;n++){
            System.out.print("第"+n+"个数组元素：");
            for(int i=0;i<array1.length;i++){
                if(n==1){
                    array1[i]=s.nextInt();
                }else{
                    array2[i]=s.nextInt();
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array1=new int[10];
        int[] array2=new int[10];
        print(array1,array2);
        int[] alike;
        for(int i=0;i<array1.length;i++){
            alike=new int[i+1];
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]){
                    alike[i]=array1[i];
                    System.out.print(alike[i]+"\t");
                }
            }
        }

    }
}


//1 2 4 3 0 67 54 51 7 11
//1 5 3 2 8 34 21 12 4 6

//1 2 13 5 8 67 54 51 73 11
//4 7 6 12 18 34 21 12 14 56