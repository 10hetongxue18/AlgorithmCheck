package OneToThirteen;

import java.util.HashSet;
import java.util.Set;

/**
 * 年龄问题
 *
 * @author hetongxue
 * @date 2022/9/2 - 0:05
 */
public class AgeProblem {
    static boolean check(String s){
        Set<Character> set=new HashSet<>();

        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size()==10;
    }

    public static void main(String[] args) {
        for(int i=10;i<100;i++){
            int i1=i*i*i;
            int i2=i1*i;
            String s1=i1+"";
            String s2=i2+"";
            if(s1.length()==4&&s2.length()==6&&check(s1+s2)){
                System.out.println(i);
                break;
            }
        }
    }

}
