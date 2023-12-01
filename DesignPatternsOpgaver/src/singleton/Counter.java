package singleton;

public class Counter {
    private int value = 0;
    private static volatile Counter uniqueInstance;

    private  int potensTemp = 0;

    /*
    Med
     */
    private Counter(){

    }



    public static Counter getInstance(){
        if(uniqueInstance == null) {
            synchronized (Counter.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new Counter();
                }
            }
        }


        return uniqueInstance;
    }

    public  void count(){
        value++;
    }




    public  void times2(){
        value *=2;
    }


    public void zero(){
        value = 0;
    }


    public  int getValue(){
        return value;
    }


    public void potens(int potens){
        int  valueTemp = value;
        for(int i = 0; i < potens-1; i++){
            value = valueTemp * value;
        }

    }

    public  void squareRoot(){
        int valueTemp1 = 0;
        int valueTemp2 = 0;
        while (valueTemp1 + valueTemp2 != value){
            valueTemp1++;
            valueTemp2++;
        }
        value = valueTemp1;
    }




}
