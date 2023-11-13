package opgave5;

import java.util.ArrayList;
import java.util.Scanner;

public class TalFolge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et tal n ");
        int n = input.nextInt();

        System.out.println(talFolgeMetode(n));
        System.out.println("loop time");
        System.out.println(talFolgeMetodeIterativ(n));

    }

    private static int talFolgeMetodeIterativ(int n) {
        ArrayList<Integer> list = new ArrayList<>(n+1);
        list.add(2);
        if(n > 0){
            list.add(1);
        }
        if (n > 1){
            list.add(5);
        }
        for(int i = 3; i <= n; i++){
            if(i  % 2 == 0){
                list.add(2 * list.get(i-3)-list.get(i-1));
            }
            else{
                list.add(list.get(i-1)+list.get(i-2)+3*list.get(i-3));
            }
        }

        return list.get(n);
    }






    public static int talFolgeMetode(int n){
        int result = 0;
        if(n == 0){
            result = 2;
        }
        else if (n ==1){
            result = 1;
        }
        else if(n==2){
            result = 5;
        }
        else{
            if(n % 2 == 0){
                result = 2 * talFolgeMetode(n -3) - talFolgeMetode(n-1);
            }else
            {
                result = talFolgeMetode(n-1) + talFolgeMetode(n-2)+ 3*talFolgeMetode(n-3);
            }

        }
        return result;


    }
}
