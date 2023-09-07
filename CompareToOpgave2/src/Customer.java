public class Customer implements Comparable<Customer>{
    private String fornavn;
    private String efterNavn;
    private int alder;

    public Customer(String fornavn, String efterNavn, int alder) {
        this.fornavn = fornavn;
        this.efterNavn = efterNavn;
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfterNavn() {
        return efterNavn;
    }

    public void setEfterNavn(String efterNavn) {
        this.efterNavn = efterNavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override
    public int compareTo(Customer coe) {
        int comp = this.efterNavn.compareTo(coe.getEfterNavn());
        if(comp == 0) {
            comp = this.fornavn.compareTo(coe.getFornavn());
        }else if(comp ==0){
                comp = this.alder - coe.getAlder();
            }
        return comp;
        }





    @Override
    public String toString() {
        return "Customer{" +
                "fornavn='" + fornavn + '\'' +
                ", efterNavn='" + efterNavn + '\'' +
                ", alder=" + alder +
                '}';
    }
}
