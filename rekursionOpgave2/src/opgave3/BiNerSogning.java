package opgave3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiNerSogning {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et tal for at se om der i listen ved binære søgning ");
        int key = input.nextInt();
        System.out.println( "Det er " + binarSearch(list,key));


    }

    private static boolean binarSearch(ArrayList<Integer> list,int key) {
        int low = 0;
        int high = list.size()-1;
        return binarSearch(list,key,low,high);
    }

    private static boolean binarSearch(ArrayList<Integer> list, int key, int low, int high) {
        if(low > high){
            return false;
        }
        int mid = (high+low) /2;
        if(list.get(mid) == key){
            return true;
        }
        else if(key > list.get(mid)){
            return binarSearch(list,key,mid+1,high);

        }else{
            return binarSearch(list,key,low,mid-1);
        }
    }
}
