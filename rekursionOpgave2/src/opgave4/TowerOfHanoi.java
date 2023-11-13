package opgave4;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast antal disk ");
        int n = input.nextInt();

  towerOfHanoiMetode(n,'A','B','C',0);


        System.out.println();

        hanoi(4,1,3);


    }

    private static void hanoi(int disks, int from, int to) {
        int other = 6-from-to;
        if(disks == 1){
            System.out.println("Flytter fra " + from + " til " + to);
        }
        else {
            hanoi(disks-1,from,other);
            System.out.println("Flyt fra " + from + " til " + to);
            hanoi(disks-1,other,to);
        }

    }

    private static void towerOfHanoiMetode(int n,char Astang,char Bstang,char Cstang,int count) {
        int count1 = 0;
        if(n == 1) {
            count++;
            System.out.println(count);
            System.out.println("Flytter " + n + " fra " + Astang + " til " + Bstang + " har talt " + count);
        }
        else {
            count++;
            System.out.println(count);
            towerOfHanoiMetode(n-1,Astang,Cstang,Bstang,count);
            System.out.println("Flytter " + n + " fra " + Astang + " til " + Bstang + " har talt " +count);
            count++;
            System.out.println(count);
            towerOfHanoiMetode(n-1,Cstang,Bstang,Astang,count);
            count++;
            count1 = (n -1) *2 +1;
            System.out.println("Udregnet " + count1);
        }
//        return count;



    }
}
