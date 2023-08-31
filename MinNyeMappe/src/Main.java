import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Hus hus1 = new Hus("VimmersVej 11", 2,10,"HusNR2",100);
        SommerHus sommerHus1 = new SommerHus("HammersVej",1,2,"ninthy40'er",200,true);

        System.out.println(hus1.getHusNr());


        ArrayList<Hus> listHus = new ArrayList<>();

        listHus.add(hus1);
        listHus.add(sommerHus1);

        for(Hus h : listHus){
            if(h instanceof SommerHus){
                System.out.println(h.getHusNr() + " Er et sommerhus");
            }
        }

        Beboelse [] beboelsesr = new Beboelse[10];
        beboelsesr[0] = new Hus("Vandt",10,1000,"20",1000);

    }

}