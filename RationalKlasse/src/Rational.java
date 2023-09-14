//public class Rational extends Number implements Comparable<Rational> {
//    private long teller;
//    private long nevner;
//
//    public Rational() {
//    }
//
//    public Rational(long teller, long nevner) {
//        this.teller = teller;
//        this.nevner = nevner;
//    }
//
//
//    public long getTeller() {
//        return teller;
//    }
//
//    public long getNevner() {
//        return nevner;
//    }
//    public Rational addRational(Rational secondRational){
//        long newTeller1 = (this.teller * secondRational.getNevner()) + (this.nevner * secondRational.getTeller());
//        long newNevner = (this.nevner * secondRational.getNevner());
//        Rational newRational = new Rational(newTeller1,newNevner);
//        return newRational;
//    }
//
//
//
//
//
//    @Override
//    public String toString() {
//        return "Rational{" +
//                "teller=" + teller +
//                ", nevner=" + nevner +
//                '}';
//    }
//}
