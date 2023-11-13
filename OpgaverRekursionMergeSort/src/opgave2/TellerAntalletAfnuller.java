package opgave2;

import java.util.ArrayList;
import java.util.List;

public class TellerAntalletAfnuller {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2,3,0,5,4,9,3,0,2,1,0,0,0));
        System.out.println(tellAntalNull(list,0,list.size()-1));

    }

    public static int tellAntalNull(List<Integer> list, int l, int h){
        int countZero = 0;
        if(l == h){
            if( list.get(h) == 0){
                countZero ++;
            }
        }
        else {
            int m = (l + h) / 2;
            int sumAntalNull = tellAntalNull(list,l,m);
            int sumAntalNull2 = tellAntalNull(list,m+1,h);
            countZero = sumAntalNull + sumAntalNull2;

        }
        return countZero;

    }
}
