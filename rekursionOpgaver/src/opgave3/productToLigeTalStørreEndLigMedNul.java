package opgave3;

import java.util.Scanner;

public class productToLigeTalStørreEndLigMedNul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast tal a");
        int a = input.nextInt();
        System.out.println("Indtast tal b ");
        int b = input.nextInt();

        System.out.println("a = " + a + " og b = " + b + " er lig med = " + product(a,b));

    }

    private static int product(int a, int b) {
        int result = 0;
//        if (a == 0) {
//           result = 0;
//        } else {
            result = productRus(a-1,b) + b;
//        }
        return result;
    }

    private static int productRus(int a, int b) {
        int result = 0;
        if(a== 0){
            result = 0;
        }else {
            if (a % 2 != 0 && a >= 1) {
                result = productRus(a - 1, b) +b;
            } else if (a % 2 == 0 && a > 1) {
                result = productRus((a / 2), b*2);
            }
        }
        return result;




    }
}
