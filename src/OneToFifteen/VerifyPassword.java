package OneToFifteen;

import java.util.Scanner;

/**
 * 判断密码是否符合要求
 *
 * @author hetongxue
 * @date 2022/9/2 - 1:11
 */
public class VerifyPassword {

    public static boolean validatePassword(String str){
        String s="^(?=.*[0-9].*)(?=.*[A-Z].*)(?=.*[a-z].*).{6,10}$";
        if(str.matches(s)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一个密码字符串：");
        String str=s.nextLine();
        boolean b = validatePassword(str);
        if(b){
            System.out.println("字符串"+str+"是否有效密码：是");
        }else{
            System.out.println("字符串"+str+"是否有效密码：否");
        }

    }
}
