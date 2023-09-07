public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        GeometriskObjekt rektangel = new Reaktangel(10,11,2,3);

        System.out.println("en rektangel med et areal på " + rektangel.getAreal() +
                " Som har x,y koordinaterne " + rektangel.getX() + "," +rektangel.getY());

    }
}