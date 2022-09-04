package OneToTwenty;

import java.util.Scanner;

/**
 * 求一个3x3矩阵对角线元素之和
 *
 * @author hetongxue
 * @date 2022/9/4 - 13:22
 */
public class Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] matrix=new int[3][3];
        int a=0,b=0;
        for (int i = 0; i <matrix.length ; i++) {
//            System.out.println();
            for (int j = 0; j <matrix.length ; j++) {
                matrix[i][j]=s.nextInt();
                if(i==j){
                    a+=matrix[i][j];
                }
                if(i+j==2){
                    b+=matrix[i][j];
                }
//                System.out.print(matrix[i][j]+" ");
            }
        }
//        System.out.println();
        System.out.print("a:"+a+" "+"b:"+b);
        //1 2 3 1 1 1 3 2 1
    }
}
