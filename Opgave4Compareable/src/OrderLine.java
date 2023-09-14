public class OrderLine {
    private int lineNumber;
    private int count;
    private Produkt produktet;



    OrderLine(int lineNumber, int count, Produkt produktet){
        this.lineNumber = lineNumber;
        this.count = count;
        this.produktet = produktet;

    }

    public int getLineNumber() {
        return lineNumber;
    }
    public int getCount() {
        return count;
    }


    public void setProdukt(Produkt produktet){
        if(this.produktet != produktet){
            this.produktet = produktet;
        }
    }

    public Produkt getProduktet(){
        return this.produktet;
    }

    public double getOrderLinePris(){
        double pris = produktet.getUnitPrice();
        return pris * count;
    }
}
