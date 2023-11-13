package snacks;

import java.util.Random;

public class Pez extends Snack implements Comparable<Pez>
{
    @Override
    public int compareTo(Pez o) {
        return this.getFlavor().compareTo(o.getFlavor());
    }

    public enum Flavors
    {
        Banana, CandyCorn, Cherry, Grape, Lemon, Orange, Raspberry, Strawberry
    }

    private Flavors flavor;

    public Pez()
    {
        Random random = new Random();
        Flavors[] flavors = Flavors.values();
        this.flavor = flavors[random.nextInt(flavors.length)];
    }

    public Pez(Flavors flavor)
    {
        this.flavor = flavor;
    }

    public Flavors getFlavor()
    {
        return flavor;
    }
}
