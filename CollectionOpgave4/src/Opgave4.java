import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Opgave4 {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("CollectionOpgave4/Karakter");
        Map<String,Integer> map = new HashMap<>();
        int nummer;
        String navn = null;


       try (Scanner scan = new Scanner(file)){
           System.out.println(scan.nextLine());
           while (scan.hasNext()) {

                   navn = scan.nextLine();
                   System.out.println(navn);

                   nummer = Integer.parseInt(scan.nextLine());
                   System.out.println(nummer);
                   map.put(navn,nummer);




           }
       }
       catch (IOException e){
           System.out.println(e.getMessage());

       }

        System.out.println(map);



    }
}
