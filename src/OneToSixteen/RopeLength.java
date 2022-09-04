package OneToSixteen;

/**
 * 求绳子对的长度
 *
 * @author hetongxue
 * @date 2022/9/2 - 9:38
 */
public class RopeLength {
    public static void main(String[] args) {
        int length;
        for (int i = 0; i <1000 ; i++) {
            if(21*i+41==34*i+2){
                length=21*i+41;
                System.out.println("这根绳子长："+length);
            }
        }

    }
}
