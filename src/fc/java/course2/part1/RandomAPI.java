package fc.java.course2.part1;
import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random rand=new Random();
        int[] arr=new int[6];
        int i=0;
        while(i<6){
            int num=rand.nextInt(6)+1;
            boolean isDuplicate=false;
            for (int j=0;j<i;j++)
            {
                if(arr[j]==num){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                arr[i++]=num;
            }
        }
        for(int check: arr){
            System.out.println(check +" ");
        }
    }
}
