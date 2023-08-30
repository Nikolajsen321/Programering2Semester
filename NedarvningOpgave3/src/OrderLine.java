public class OrderLine {
    private int lineNumber;
    private int count;

    public int getLineNumber() {
        return lineNumber;
    }

    public int getCount() {
        return count;
    }

    OrderLine(int lineNumber, int count){
        this.lineNumber = lineNumber;
        this.count = count;

    }
}
