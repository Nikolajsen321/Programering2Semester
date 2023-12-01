package opgave6;

import java.util.Scanner;

public class RekursionDomino {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast n  for formlen n x 2 ");
        int n = input.nextInt();

        System.out.println("Antal måder man kan fylde brættet for  " + n + " er " + dominiBrikker(n));


    }

    private static int dominiBrikker(int n) {
        int result = 0;
        if(n == 1) {
            result = 1;
        }
       else if(n == 2){
            result = 2;
        }
       else {
           result = dominiBrikker(n-1) + dominiBrikker(n-2);
        }
       return result;
    }
}
