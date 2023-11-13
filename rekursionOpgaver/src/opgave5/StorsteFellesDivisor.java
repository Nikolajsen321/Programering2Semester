package opgave5;

import java.util.Scanner;

public class StorsteFellesDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast første hele positiv tal ");
        int a = input.nextInt();
        System.out.println("Indtast næste hele positiv tal " );
        int b = input.nextInt();

        System.out.println("Største fælles nævner er " + sfd(a,b));


    }

    private static int sfd(int a, int b) {
        int divsor = 0;
        if(b <= a && a % b == 0) {
           divsor = b;
        }
        else if(a < b) {
            divsor = sfd(b,a);
        }
        else{
            divsor = sfd(b,(a % b));
        }
        return divsor;
    }
}
