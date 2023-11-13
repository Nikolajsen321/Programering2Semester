package opgave2;

public class PalindromOpgave {
    public static void main(String[] args) {
        String teks1 = "ABBA";
        String tekst2 = "radar";

        System.out.println("Er " + teks1 + " et palindrom " + palindromMetode(teks1));
        System.out.println("Er " + teks1 + " et palindrom " + palindromMetode(tekst2));

    }

    private static boolean palindromMetode(String teks1) {
        int start;
        return palindromMetode(teks1,0,teks1.length()-1);
    }

    private static boolean palindromMetode(String teks1, int start, int slut) {
        if(slut <= start ){ //terminerings regel
            return true;
        }else if(teks1.charAt(start) == teks1.charAt(slut)){ // rekursionregel
            return palindromMetode(teks1,start+1,slut-1);
        }else {
            return false;
        }

    }


}
