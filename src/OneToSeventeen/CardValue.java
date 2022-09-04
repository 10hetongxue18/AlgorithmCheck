package OneToSeventeen;


/**
 * 竞猜卡片值
 *
 * @author hetongxue
 * @date 2022/9/2 - 10:45
 */
public class CardValue {
    public static void main(String[] args) {
        int[] nums={2,3,4,5,6,7,8};
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums.length ; j++) {
                if((nums[i]+nums[j])%2!=0){
                    count++;
                }
            }
        }
        System.out.println("小米猜对的次数为："+count);


    }
}
