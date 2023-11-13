package opgave1;

import java.util.Scanner;

public class Fakultet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et tilfældig ikke negative til ");
        int tal = input.nextInt();

        System.out.println("Det faktorel tal af " + tal + "!" + " er " + faktoralTal(tal) );
    }

    private static int faktoralTal(int tal) {
        int result = 0;
        if(tal == 0){ //termenerings regel
            result = 1;
        }
        else {
            result = tal * faktoralTal(tal -1); //rekurrensregel
        }
        return result;
    }
}
