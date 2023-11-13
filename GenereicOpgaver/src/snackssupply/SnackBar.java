package snackssupply;

import snacks.Snack;

import java.lang.reflect.Array;
import java.util.*;

public class SnackBar<E>  {







    // TODO: Implement sortSnacks(E[] snackContainer)

    /*
    At sige noget er generic er at gøre det genanvendelig, ikke bare have generics med mindre
    man snakker om type stærkhed

   Under kaldes Bounded generic type
    understående har to betydninger
    1. Der specificere at E er en generic subtype af Comparable
    2. specificere at elementet der skal compares også er af E type også fortæller E skal extend compareable

     */
    public <E  extends Comparable<E>> E[] sortSnacks(E[] snackContainer) {
       List<E> nyList =  new ArrayList<>(Arrays.asList(snackContainer));
       Collections.sort(nyList);
       E[] array = (E[]) new Comparable[nyList.size()];
       return (E[]) nyList.toArray(array);
    }
}
