package opgave4;

public class RetunereReverseRekursion {
    public static void main(String[] args) {
        String s = "RANSLIRPA";
        System.out.println(s + " bliver omvendt til " + reverseMetode(s));
    }

    private static String reverseMetode(String s) {
        String resultat  = "";
        char c = 0;
        if(s.length() == 0){
            return resultat;
        }
        else {
            c = s.charAt(s.length()-1);
            resultat += c;
            resultat += reverseMetode(s.substring(0, s.length() - 1));
            return resultat;
        }
    }
}
