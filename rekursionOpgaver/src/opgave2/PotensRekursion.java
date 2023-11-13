package opgave2;

import java.util.Scanner;

public class PotensRekursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et tal der skal opløftes ");
        int tal = input.nextInt();
        System.out.println("Indtast potensen ");
        int potens = input.nextInt();

        System.out.println(tal + " opfløtet i " + potens + " er " + potenMetode(tal,potens));
    }

    private static int potenMetode(int tal, int potens) {
        if(potens == 0){
            return 1;
        }else
        {
           return tal * potensMetode2(tal,(potens-1));
        }
    }

    private static int potensMetode2(int tal,int potens) {
        if(potens == 0){
            return 1;
        }
        else
        {
            if(potens % 2 !=0) {
                return tal * potensMetode2(tal, potens - 1);
            }
            else {
                return  potensMetode2(tal * tal,(potens/2));
            }
        }
    }
}
