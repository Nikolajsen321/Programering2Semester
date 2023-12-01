package composite;



public class App {
    public static void main(String[] args) {
        GeometriskeFigur figurCompositeAlle = new FigurComposite("Alle");
        GeometriskeFigur trekantComposite = new FigurComposite("Trekant");

        GeometriskeFigur trekant1 = new Trekant("Trekant1",20,10);
        GeometriskeFigur trekant2 = new Trekant("Trekant2",20,10);
        GeometriskeFigur trekant3 = new Trekant("Trekant3",20,10);

        GeometriskeFigur elipse1 = new Elipse(20,10,"Elipse1");
        GeometriskeFigur elipse2 = new Elipse(20,10,"Elipse2");
        GeometriskeFigur elipse3 = new Elipse(20,10,"Elipse3");

        trekantComposite.add(trekant1);
        trekantComposite.add(trekant2);
        trekantComposite.add(trekant3);




//        System.out.println(trekantComposite.tegn());



        figurCompositeAlle.add(trekantComposite);


        System.out.println(figurCompositeAlle.tegn());
        System.out.println(figurCompositeAlle.getAreal());







//        FigurComposite figurCompositeAlle = new FigurComposite("Alle");
//        FigurComposite figurCompositeElipse = new FigurComposite("ElipseSamling");
//        FigurComposite figurCompositeTrekant = new FigurComposite("TrekantSammenling");
//        FigurComposite figurCompositeRektangel = new FigurComposite("RektangelSammenling");
//
//        figurCompositeAlle.add(figurCompositeElipse);
//        figurCompositeAlle.add(figurCompositeTrekant);
//        figurCompositeAlle.add(figurCompositeRektangel);
//
//        Elipse elipse1 = new Elipse(10,20,"Elipse1");
//        Elipse elipse2 = new Elipse(10,20,"Elipse2");
//
//        Trekant trekant1 = new Trekant("Trekant1",20,10);
//        Trekant trekant2 = new Trekant("Trekant2",20,10);
//
//        Rektangel rektangel1 = new Rektangel("rektangel1",10,20);
//        Rektangel rektangel2 = new Rektangel("rektangel2",10,20);
//
//
//
//
//
//
//
//        figurCompositeElipse.add(elipse1);
//        figurCompositeElipse.add(elipse2);
//
//        figurCompositeTrekant.add(trekant1);
//        figurCompositeTrekant.add(trekant2);
//
//        figurCompositeRektangel.add(rektangel1);
//        figurCompositeRektangel.add(rektangel2);
//
//        System.out.println(figurCompositeElipse.tegn());
//        System.out.println( " har areal ");
//        System.out.println(figurCompositeElipse.getAreal());
//
//        System.out.println();
//        System.out.println(figurCompositeTrekant.tegn());
//        System.out.println( " har areal ");
//        System.out.println(figurCompositeTrekant.getAreal());
//
//        System.out.println();
//        System.out.println(figurCompositeRektangel.tegn());
//        System.out.println("har areal ");
//        System.out.println(figurCompositeRektangel.getAreal());
//
//
//        System.out.println( figurCompositeAlle.tegn());
//        System.out.println("Har areal ");
//        System.out.println(figurCompositeAlle.getAreal());







    }
}
