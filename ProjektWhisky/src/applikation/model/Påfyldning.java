package applikation.model;

public class Påfyldning {
    private int antalLitter;
    private Destillat destillat;
    private Batch batch;

    public Påfyldning(int antalLitter) {
        this.antalLitter = antalLitter;
    }


    public Destillat getDestillat() {
        return destillat;
    }

    public void setDestillat(Destillat destillat) {
        this.destillat = destillat;
    }

    public Batch getBatch() {
        return batch;
    }

    public int getAntalLitter() {
        return antalLitter;
    }

    public void setBatch(Batch batch) {
        if (this.batch != batch) {
            Batch oldBatch = this.batch;
            if (oldBatch != null) {
                oldBatch.removePåfyldning(this);
            }
            this.batch = batch;
            if(batch != null){
                batch.addPåfyldning(this);
            }
        }
    }

}
