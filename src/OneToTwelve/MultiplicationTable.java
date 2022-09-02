package OneToTwelve;

/**
 * 九九乘法表
 *
 * @author hetongxue
 * @date 2022/9/1 - 10:49
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            System.out.println();
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
        }
    }
}
