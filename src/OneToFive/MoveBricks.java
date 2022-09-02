package OneToFive;


import java.util.Scanner;

/**
 * 搬砖
 *
 * @author hetongxue
 * @date 2022/8/29 - 17:27
 */
public class MoveBricks {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入数值m和n：");
        int m=s.nextInt();// 砖头数量
        int n=s.nextInt();// 人数

        int man, woman, child;
        for (man = 0; man < m / 4; man++) {
            for (woman = 0; woman < m / 3; woman++) {
                for (child = 0; child < m * 2; child++) {

                    if (child % 2 == 0 && n == man + woman + child && m == man * 4 + woman * 3 + child / 2) {
                        System.out.println("男人:" + man + "个 女人:" + woman + "个 小孩:" + child);
                    }
                }
            }
        }



    }

}


