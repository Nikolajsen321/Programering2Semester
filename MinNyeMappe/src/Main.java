import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Hus hus1 = new Hus("VimmersVej 11", 2,10,"HusNR2",100);
        SommerHus sommerHus1 = new SommerHus("HammersVej",1,2,"Hey",200,"Mads");

        System.out.println(hus1.getHusNr());


        ArrayList<Hus> listHus = new ArrayList<>();

        listHus.add(hus1);
        listHus.add(sommerHus1);

    }

}