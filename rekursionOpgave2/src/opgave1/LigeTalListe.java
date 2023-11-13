package opgave1;

import java.util.ArrayList;
import java.util.List;

public class LigeTalListe {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Metoden finder alle lige tal som er " + ligeTal(list));
        System.out.println();
        System.out.println("Metoden finder alle lige tal som er " + ligeTal2(list));


    }

    private static int ligeTal(ArrayList<Integer> list) {
        int result = 0;
        ArrayList<Integer> newList = new ArrayList<>(list);
        if (list.size() != 0) {
            if (newList.get(0) % 2 == 0) {
                result++;
            }
//            else {
//                newList.remove(0);
//                result += ligeTal(newList);
//            }
            newList.remove(0);
            result += ligeTal(newList);
        }
        return result;
    }


    private static int ligeTal2(ArrayList<Integer> list) {
//        int result = 0;
        int pointer = 0;
//        if (list.size() == 1) {
//            if (list.get(0) % 2 == 0) {
//                result++;
//            }
//        } else {
//            if (list.get(pointer) % 2 == 0) {
//
//            }
//        }
        return ligeTalHelpMetode(list, pointer);
    }

    private static int ligeTalHelpMetode(ArrayList<Integer> list, int pointer) {
        int result = 0;
        if (list.size() > pointer) {
            if (list.get(pointer) % 2 == 0) {
                result++;
            }
            result += ligeTalHelpMetode(list, pointer + 1);
        }
        return result;

    }
}




