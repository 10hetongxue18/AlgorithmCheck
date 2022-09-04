package OneToEighteen;

import java.util.Scanner;

/**
 * 字符串分类统计
 *
 * @author hetongxue
 * @date 2022/9/4 - 11:10
 */
public class StrSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一个字符串：");
        String str=s.nextLine();
        int a = 0,b=0,c=0,d=0;
        if(str.length()<255){
            char[] chars = str.toCharArray();
            for (int i = 0; i <str.length() ; i++) {
                if((chars[i]>='a'&&chars[i]<='z')||(chars[i]>='A'&&chars[i]<='Z')){
                    ++a;
                }else if(chars[i]>='0'&&chars[i]<='9'){
                    ++b;
                }else if (chars[i]==' '){
                    ++c;
                }else{
                    ++d;
                }
            }
            System.out.println(a+" "+b+" "+c+" "+d);
        }
        //akls jflj_+123
        //ti2 ght
    }
}
