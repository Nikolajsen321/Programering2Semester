package Opgave1;

import java.util.ArrayList;
import java.util.List;

public class SummerAlle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3));
        System.out.println(delLosMetode(list,0,list.size()-1));

    }

    public static int delLosMetode(List<Integer> list,int l, int h){
        int result = 0;

        if(l == h){
            result += list.get(h);
        }
        else
        {
            int m = (l+h) /2;
            int sum1 = delLosMetode(list,l,m);
            int sum2 = delLosMetode(list,m+1,h);
            result = sum1 +sum2;


        }
        return result;
    }
}
