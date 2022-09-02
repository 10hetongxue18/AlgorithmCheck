package OneToFourteen;

import java.util.Scanner;

/**
 * 判断学生成绩等级
 *
 * @author hetongxue
 * @date 2022/9/2 - 0:21
 */
public class StudentPerformance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入学生成绩：");
        int achievement=s.nextInt();
        if(achievement>=0&&achievement<=100){
            if(achievement<60){
                System.out.println("该学生成绩等级：不及格");
            }else if(achievement>=60&&achievement<70){
                System.out.println("该学生成绩等级：及格");
            }else if(achievement>=70&&achievement<80){
                System.out.println("该学生成绩等级：中等");
            }else if(achievement>=80&&achievement<90){
                System.out.println("该学生成绩等级：良好");
            }else if(achievement>=90){
                System.out.println("该学生成绩等级：优秀");
            }
        }

    }
}
