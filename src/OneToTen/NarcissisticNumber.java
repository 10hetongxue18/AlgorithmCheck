package OneToTen;


/**
 * 水仙花数
 *
 * @author hetongxue
 * @date 2022/8/31 - 20:34
 */
public class NarcissisticNumber {

    public static void main(String[] args) {

        int bit,ten,Hundredth;
        System.out.println("100到999之间的水仙花数有：");

        for(int i=100;i<=999;i++){
            bit=i%10; 
            ten=i/10%10;
            Hundredth=i/100;
            if(bit*bit*bit+ten*ten*ten+Hundredth*Hundredth*Hundredth==i){
                System.out.print(i+"\t");
            }
        }

    }
}
