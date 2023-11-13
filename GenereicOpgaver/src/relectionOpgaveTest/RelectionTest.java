package relectionOpgaveTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RelectionTest {
    public static void main(String[] args) throws Exception {
        /*
        Java reflection meta programering
        Reflection koden kan kigge på sig slev og for at undersøge og ændre stort set alle elementer
        af hvilken som helst java klasse i midten af ens kørende program

        Man vil her bruge Reflection til at kigge ind på strukturen af Cat klassen
        */
        Cat myCat = new Cat("Stella",6);

        //Ser om man kan få alle fields (felt variabler) der er declared i Cat klassen String name og int age
        /*
        Når man bruger reflection til at få noget information om en objekt's klasse

        Første man vil gøre er at få objektets klasse
         */
        myCat.getClass();
        /*
        getClass() metode kald er ens vindue  ind til en masse vis af reflektion egenskaber
        java tilbyder
        for at se alle de reflection værktøjer man har adgang kan man trykke dot (.)
        og husk man vil have fat på fields nu
         */
        // man kan se at metoden getDeclaredFields() retunere et array af fields
      Field[] catFields =  myCat.getClass().getDeclaredFields();
      for(Field f : catFields){
          System.out.println(f.getName());
      }
      /*
      Man kan altså skrive kode som kan se strukturen af java klassen

      I klassen Cat har man et String name field som er privat altså uden for den klasse
      har man ikke adgang til denne variable, man kan ikke view den og man kan slet ikke ændre
      det til en anden værdi
      Normal har man acesser og mutater metodr (get og set metoder)
      name kan kun sættes i constuctoren i klassen fordi der ikke nogle setMetode da den jo er final
       (giver ikke mening at have en)

       Men ved reflection forsvindre alle reglerne uden at ændre nogle ting ved source koden af Cat class
       kan man bruge reflection til at tvinge java til at ændre navnet på katten
       så det man vil gøre er nu at kigge efeter det field man er interseret i
       vi ved jo nu fra før at der er et field som hedder name

       Det man vil gøre når man finder det rigtige field er der en metode man kan kalde på field
       kaldet set()

       set() metoden tager to parameter første er Objekt man vil sætte field på(myCat) og næste er værdien
       man vil sætte field til at have altså hvad navn skal katten have

       Når man kalder denne set() metode java tvinger en til at håndter en exception
       den kan kaste, en checkedException() altså en der skal ordnes før man kan gå videre

       sætter op ved psvm throws

       Har nu kode som forsøger at sætte name field på myCat objekt til noget andet
       */


//        for(Field f : catFields){
//            if(f.getName().equals("name")){
//                f.set(myCat,"Jimmy McGill");
//            }
//        }


        /*
        Man får en IllegalAccessException fordi man ikke har lov til at ændre et field med
        modifier privat og final
        Men der er dog en måde at gør det på
        Man skal fortælle java at fieldet skal være accesable
         */
        for(Field f : catFields){
            if(f.getName().equals("name")){
                f.setAccessible(true);
                f.set(myCat,"Jimmy McGill");

            }
        }

        System.out.println(myCat.getName());

        /*
        Reflection Metoder

        Reflection er ikke er begrænset til field man kan gøre ligne ting ved metoder
       man kan få alle metoder declared i en klasse på stort set samme måde
         */
        System.out.println();

       Method [] catMethods = myCat.getClass().getDeclaredMethods();

       for(Method m: catMethods){
           System.out.println(m.getName());
           /*
           Man lægger mærke til når man køre kode de ikke bliver sat i array i nogle
           bestemt orden og derfor vil man lige loop igennem  dem for at
           identificere den indviduelle man vil arbejde med
            */

       }

       /*
       Vil teste om man kan bruge reflection til at trigger meow() metoden
       benytter invoke() metoden som tager parameter som minder om da man kaldte set metoden
       for fields
       første parameter er Objektet man vil kalde metoden på (myCat) i dette tilfælde
       tager meow() metoden ikke nogle parameter  så for at invoke() metoden meow()
       skal man ikke tilføre parameterne også i invoke() call
       hvis meow hade skulle man bare add dem invoke(myCat,parameter1,parameter2 osv..)



        */
        System.out.println();
        for(Method m: catMethods) {
            if(m.getName().equals("meow")){
                m.invoke(myCat);
            }
        }

        /*
        Den kalder meow metoden succesfuld med reflection men i dette tilfælde ikke særlig imponerende
        det en public void meow() metode (public metode)  man kunne bare direkte have kaldt meow metoden
        på myCat objekt uden reflektion så det skulle man have gjort ved en public metode


        Men hvad hvis man i stedet ville invoke en privat metode som man ikke har adgang til på
        myCat objektet?

        fx metoden() heyThisIsPrivate()
        Man kan ikke kalde på objekt myCat men kan via Reflection

        får ligsom ved fields illegalAccesException
        fix for det er ligesom field set acceisble til true

         */
        System.out.println();
        for(Method m: catMethods) {
            if(m.getName().equals("heyThisIsPrivate")){
                m.setAccessible(true);
                m.invoke(myCat);
            }
        }

        /*
        En anden god ting at vide er når man kalder invoke metode skall man pass myCat Objekt som parameter
        som man vil invoke metoden på
        Men nogle metoder er static

        Hvis man bruger reflection og vil gerne kunne kalde thisIsAPublicStaticMethod metoden
        uden at skal bruge et specfik Cat objekt skal invoke() har parameteren null

        og det samme virker for en private static
         */
        System.out.println();
        for(Method m: catMethods) {
            if(m.getName().equals("thisIsAPublicStaticMethod")){
                m.setAccessible(true);
                m.invoke(null);
            }
        }


        /*
        Man kan bruge reflection:
        for at se alle metoder der er tilgænglige og se hvordan man kan manipulere programet
         */





    }
}
