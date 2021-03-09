import org.w3c.dom.ls.LSInput;

import java.lang.reflect.Array;
import java.util.*;
import java.math.*;

public class HelloWorld {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("How many numbers do you need to draw ?");
        int k=in.nextInt();
        System.out.println("What is the highest number you can draw?");
        int n=in.nextInt();
        BigInteger lot= new BigInteger("894161515133513513513131313131522222222222222222222222222222222222222222666666666666666666666666666666666666666666");
        for(int i=1;i<=k;i++)
        {
            lot=lot.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));

        }
        System.out.println("your odds are 1 in "+lot+". Good luck!");
//        Scanner in=new Scanner(System.in);
//        System.out.println("How many numbers do you need to draw ?");
//        int k=in.nextInt();
//        System.out.println("What is the highest number you can draw?");
//        int n=in.nextInt();
//        int[] nums=new int[n];
//        for(int i=0;i<nums.length;i++)
//        {
//            nums[i]=i;
//        }
//        int[] result=new int[k];
//        for(int i=0;i<nums.length;i++)
//        {
//            int r=(int)(Math.random()*n);
//            result[i]=nums[r];
//            nums[r]=nums[n-1];  //洗牌操作
//            n--;
//
//
//        }
//        Arrays.sort(result);
//        System.out.println("Bet the following combination");
//        for(int r:result)
//            System.out.println(r);

//        final int MAX=10;
//        int[][] odds=new int[MAX+1][];
//        for(int n=0;n<=MAX;n++)
//            odds[n]=new int[n+1];
//        for(int n=0;n<odds.length;n++)
//            for(int k=0;k<odds[n].length;k++)
//            {
//                int lotteryOdds=1;
//                for(int i=1;i<=k;i++)
//                    lotteryOdds=lotteryOdds*(n-i+1)/i;
//                 odds[n][k]=lotteryOdds;
//
//            }
//        for(int[] row:odds)
//        {
//            for(int odd:row)
//                System.out.printf("%4d",odd);
//            System.out.println();
//        }


    }
}
